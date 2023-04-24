# Java Voice Quickstart

This quickstart serves as a guide to get your first Voice application up and running with [FreeClimb](https://docs.freeclimb.com/docs/how-freeclimb-works).

Specifically, the project will:

- Receive an incoming call via a FreeClimb application
- Respond with a [PerCL](https://docs.freeclimb.com/reference/percl-overview) command to say 'Hello World!' to caller

## Tutorial

We offer a [Java Voice Quickstart Tutorial](https://docs.freeclimb.com/docs/java-voice-calling-quickstart) for more detailed set-up instructions and explanation of how FreeClimb works.

## Requirements
A [FreeClimb account](https://www.freeclimb.com/dashboard/signup/)

A [registered application](https://docs.freeclimb.com/docs/registering-and-configuring-an-application#register-an-app) with a named alias

A [configured FreeClimb number](https://docs.freeclimb.com/docs/getting-and-configuring-a-freeclimb-number) assigned to your application

Trial accounts: a [verified number](https://docs.freeclimb.com/docs/using-your-trial-account#verifying-outbound-numbers)

Tools:
- [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html/) 8 or higher
- [Gradle](https://gradle.org/install/) 5.5 or higher
- [ngrok](https://ngrok.com/download) (recommended for hosting)
- [Git](https://git-scm.com/)

## Setting up the Quickstart
1. Make your local server publicly accessible
    ```bash
    ngrok http 80
    ```
    Once you run ngrok you should receive a response with a public URL, that looks something like 'https://92832de0.ngrok.io'. 

2. [Configure your applications's endpoints](https://docs.freeclimb.com/docs/registering-and-configuring-an-application#configure-your-application) by adding a publicly accessible URL (we recommend an [ngrok](https://ngrok.com/download) URL) and the route reference `/incomingCall` to your App Config's VoiceURL:

    ```bash
    https://YOUR-URL.ngrok.io/incomingCall
    ```
    
## Running the Quickstart
1. Start your voice quickstart application

    ```bash
    gradle build && java -Dserver.port=0080 -jar build/libs/Java-Getting-Started-Tutorial-3.0.6-plain.jar
    ```

2. Call the FreeClimb number assigned to the application you've configured for this tutorial 

## Feedback & Issues
If you would like to give the team feedback or you encounter a problem, please [contact support](https://www.freeclimb.com/support/) or [submit a ticket](https://freeclimb.com/dashboard/portal/support) in the dashboard.