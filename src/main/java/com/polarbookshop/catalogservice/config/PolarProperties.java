package com.polarbookshop.catalogservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

// marca como detentora de dados de configuração
@ConfigurationProperties(prefix = "polar") //prefix define a chave da propriedade
public class PolarProperties {

    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
