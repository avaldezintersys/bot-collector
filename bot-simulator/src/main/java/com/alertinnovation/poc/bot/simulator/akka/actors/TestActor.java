package com.alertinnovation.poc.bot.simulator.akka.actors;

import akka.actor.AbstractActor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder().matchAny(o -> {
            System.out.println("Received message:" + o);
        }).build();
    }
}
