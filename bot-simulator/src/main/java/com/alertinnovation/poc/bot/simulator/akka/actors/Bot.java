package com.alertinnovation.poc.bot.simulator.akka.actors;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bot {

    private ActorContext<Event> context;
    private String name;
    protected Logger logger = LoggerFactory.getLogger( getClass() );

    @Autowired
    public Bot(ActorContext<Event> context){
        this.context = context;
    }

    // Bot's States
    private Behavior<Event> starting(){
        return Behaviors.receive(Event.class)
                .onMessage(Events.START.class, (msg)->{
                    logger.info(msg.toString());
                    return ready();
                }).build();
    }

    private Behavior<Event> ready(){
        return Behaviors.receive(Event.class)
                .onMessage(Events.START.class, (msg)->{
                    logger.info(msg.toString());
                    return null;
                }).build();
    }
}