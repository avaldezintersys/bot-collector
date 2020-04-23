package com.alertinnovation.poc.bot.simulator.utils

import com.alertinnovation.poc.bot.simulator.source.BotState
import org.apache.log4j.BasicConfigurator
import spock.lang.Specification

class AvroUtilsTest extends Specification {

    def BotState botState

    void setup() {
        BasicConfigurator.configure();
        botState = new BotState()
    }

    def "Schema Creation"() {
        given:
            def schema = AvroUtils.SchemaCreation()

        when:
            def length = schema.length()

        then:
            length > 0
            schema.contains("\"type\":\"record\",\"name\":\"BotState\"")
    }

    def "Save Schema"() {
        given:
            def schema = AvroUtils.SchemaCreation()

        when:
            def fileCreated = AvroUtils.saveSchema()

        then:
            fileCreated == "./botstate.avsc"
    }
}
