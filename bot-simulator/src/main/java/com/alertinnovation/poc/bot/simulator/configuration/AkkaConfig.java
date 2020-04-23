package com.alertinnovation.poc.bot.simulator.configuration;

import akka.actor.ActorSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.alertinnovation.poc.bot.simulator.akka.spring.SpringExtProvider.SPRING_EXTENSION_PROVIDER;

@Configuration
public class AkkaConfig {
    private final ApplicationContext context;

    @Autowired
    public AkkaConfig(ApplicationContext context) {
        this.context = context;
    }

    @Bean
    public ActorSystem actorSystem() {
        ActorSystem system = ActorSystem.create("system");
        SPRING_EXTENSION_PROVIDER.get(system).init(context);
        return system;
    }
}
