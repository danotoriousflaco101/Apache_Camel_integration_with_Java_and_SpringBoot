package com.flaco.joke_gateway.route;

import com.flaco.joke_gateway.model.Joke;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class JokeRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
            .component("servlet")
            .bindingMode(RestBindingMode.auto);

        rest("/battuta")
            .get()
            .description("Richiede e restituisce una battuta casuale")
            .to("direct:fetchJoke");

        from("direct:fetchJoke")
            .routeId("joke-fetch-route")
            .log("Richiesta per una nuova battuta ricevuta...")
            .to("https://official-joke-api.appspot.com/random_joke?bridgeEndpoint=true")
            .unmarshal().json(Joke.class) // Ora Camel sa dove trovare la classe Joke
            .setBody(simple("${body.setup} ... ${body.punchline}"))
            .log("Battuta pronta per essere restituita: ${body}");
    }
}