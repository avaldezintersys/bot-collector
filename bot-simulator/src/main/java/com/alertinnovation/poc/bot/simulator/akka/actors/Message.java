package com.alertinnovation.poc.bot.simulator.akka.actors;

import com.alertinnovation.rcs.actor.messages.botstatecollector.BotState;
import com.alertinnovation.rcs.bot.datatypes.ChargeState;
import com.alertinnovation.rcs.bot.datatypes.PositionSource;
import com.alertinnovation.rcs.bot.datatypes.PowerSupplyStatus;
import com.alertinnovation.rcs.bot.datatypes.TelemetryStatus;
import com.alertinnovation.rcs.datatypes.UccLocation;

import java.net.InetSocketAddress;

public class Message implements Data {
    private BotState botState;
}
