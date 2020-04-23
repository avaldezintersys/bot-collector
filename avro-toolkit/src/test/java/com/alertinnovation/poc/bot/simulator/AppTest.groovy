package com.alertinnovation.poc.bot.simulator

import com.alertinnovation.poc.bot.simulator.source.BotState
import com.alertinnovation.poc.bot.simulator.utils.AvroUtils
import org.apache.log4j.BasicConfigurator
import spock.lang.Specification

class AppTest extends Specification {

    void setup(){
        BasicConfigurator.configure()
    }

    def "Integration test"() {
        given:
            def app = new App()

        when:
            app.main(null)
        then:
            0 * AvroUtils.SchemaCreation()
            0 * AvroUtils.saveSchema()
    }

}
