package com.flaco.joke_gateway.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelServletConfiguration { // <-- Assicurati che il nome della classe sia questo!

    @Bean
    public ServletRegistrationBean<CamelHttpTransportServlet> camelServletRegistrationBean() {
        CamelHttpTransportServlet camelServlet = new CamelHttpTransportServlet();
        ServletRegistrationBean<CamelHttpTransportServlet> registration =
            new ServletRegistrationBean<>(camelServlet, "/api/*");
        registration.setName("CamelServlet");
        return registration;
    }
}