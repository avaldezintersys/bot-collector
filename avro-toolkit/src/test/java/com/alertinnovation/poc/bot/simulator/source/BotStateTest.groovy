package com.alertinnovation.poc.bot.simulator.source

import spock.lang.Specification

class BotStateTest extends Specification {

    def "Object creation"() {
        given:
        def botState = new BotState()
        botState.setBotId("botIdentifier")

        when:
        def botId = botState.getBotId()

        then:
        botId == "botIdentifier"
    }
}
