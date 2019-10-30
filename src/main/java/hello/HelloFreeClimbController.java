package main.java.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vailsys.freeclimb.percl.PerCLScript;
import com.vailsys.freeclimb.percl.Say;

@RestController
public class HelloFreeClimbController {
  @RequestMapping("/voice")
  public String index() {
    PerCLScript script = new PerCLScript();
    Say sayHelloWorld = new Say("Hello world!");
    script.add(sayHelloWorld);

    return script.toJson();
  }

}