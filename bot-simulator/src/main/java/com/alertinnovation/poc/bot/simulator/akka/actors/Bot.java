package com.alertinnovation.poc.bot.simulator.akka.actors;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import com.alertinnovation.rcs.actor.messages.botstatecollector.BotState;
import com.alertinnovation.rcs.bot.datatypes.ChargeState;
import com.alertinnovation.rcs.bot.datatypes.PositionSource;
import com.alertinnovation.rcs.bot.datatypes.PowerSupplyStatus;
import com.alertinnovation.rcs.bot.datatypes.TelemetryStatus;
import com.alertinnovation.rcs.datatypes.UccLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
@Scope (ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bot {

    private ActorContext<Event> context;
    private String name;
    protected Logger logger = LoggerFactory.getLogger( getClass() );
    /**
     * Bot state builder.
     */
    private static final BotState.BotStateBuilder BOT_STATE_BUILDER = BotState.builder()
            .botAddress(new InetSocketAddress("127.0.0.11", 5555))
            .pmuAddress(new InetSocketAddress("127.0.0.11", 6666))
            .toteId("toteId")
            .location(UccLocation.builder().areaType(UccLocation.AreaType.DECK).build())
            .telemetryStatus(TelemetryStatus.ONLINE)
            .telemetryStatus(TelemetryStatus.HOMED)
            .telemetryStatus(TelemetryStatus.WHEELS_OUT)
            .positionSource(PositionSource.RFID_READ)
            .rotation(170)
            .isParked(false)
            .isPositionConfirmed(true)
            .isSleeping(false)
            .batteryVoltage(11)
            .chargeRate(22)
            .chargeState(ChargeState.CHARGING)
            .chargeTarget(70)
            .amperage(33)
            .powerSupplyStatus(PowerSupplyStatus.CONNECTED)
            .frontTemperature(11.9f)
            .frontHumidity(12.8f)
            .rearTemperature(13.7f)
            .rearHumidity(14.6f)
            .therm1Temperature(21.3f)
            .therm2Temperature(22.2f)
            .therm3Temperature(23.1f)
            .therm4Temperature(24.0f);

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