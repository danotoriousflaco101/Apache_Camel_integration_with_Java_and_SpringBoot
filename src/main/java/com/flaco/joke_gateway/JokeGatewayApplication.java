package com.flaco.joke_gateway;

import org.apache.camel.component.servlet.springboot.ServletMappingAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = ServletMappingAutoConfiguration.class)
public class JokeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeGatewayApplication.class, args);
    }
}