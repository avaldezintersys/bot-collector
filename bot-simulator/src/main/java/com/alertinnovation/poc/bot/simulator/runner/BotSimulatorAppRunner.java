package com.alertinnovation.poc.bot.simulator.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BotSimulatorAppRunner implements ApplicationRunner {

    protected Logger logger = LoggerFactory.getLogger( getClass() );

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Running app");
    }
}
