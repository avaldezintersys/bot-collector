package com.alertinnovation.poc.bot.simulator.akka.spring;

import akka.actor.Extension;
import akka.actor.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class SpringExt implements Extension {
    private ApplicationContext context;
    protected Logger logger = LoggerFactory.getLogger( getClass() );


    public void init(ApplicationContext context) {
        logger.info("applicationContext initializes...");
        this.context = context;
    }

    /**
     * This method is used to create a Props object. Depending on the DI component created earlier, to get the Props object, we can create an Actor bean object.
     *
     * @param beanName actor bean name
     * @return props
     */
    public Props create(String beanName) {
        return Props.create(SpringActorProducer.class, this.context, beanName);
    }
}

