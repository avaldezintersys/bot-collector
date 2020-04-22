package com.alertinnovation.poc.bot.simulator.akka.spring;

import akka.actor.AbstractExtensionId;
import akka.actor.ExtendedActorSystem;

public class SpringExtProvider extends AbstractExtensionId<SpringExt> {
    private static SpringExtProvider provider = new SpringExtProvider();
    public static final SpringExtProvider SPRING_EXTENSION_PROVIDER
            = getInstance();

    private static SpringExtProvider getInstance() {
        return provider;
    }

    @Override
    public SpringExt createExtension(ExtendedActorSystem extendedActorSystem) {
        return new SpringExt();
    }
}
