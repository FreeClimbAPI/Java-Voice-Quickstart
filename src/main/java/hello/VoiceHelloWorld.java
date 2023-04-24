package main.java.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.freeclimbapi.*;
import com.github.freeclimbapi.models.*;

@RestController
public class VoiceHelloWorld {
  @RequestMapping("/voice")
  public String index() throws Exception {
    PerclScript script = new PerclScript();
    Say sayHelloWorld = new Say().text("Hello World!");
    script.addCommand(sayHelloWorld);

    return script.toJson();
  }

}