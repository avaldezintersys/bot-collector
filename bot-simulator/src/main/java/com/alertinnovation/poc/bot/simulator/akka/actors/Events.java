package com.alertinnovation.poc.bot.simulator.akka.actors;

public class  Events {

    // Bot's Events
    public static enum START implements Event {
        INSTANCE
    }
    public static enum PARKED implements Event {
        INSTANCE
    }
    public static enum SLEEP implements Event {
        INSTANCE
    }
    public static enum STOP implements Event {
        INSTANCE
    }
    public static enum FAILURE implements Event {
        INSTANCE
    }
    public static enum ONWAYTOPICKUP implements Event {
        INSTANCE
    }
    public static enum PICKUP implements Event {
        INSTANCE
    }
    public static enum ONWAYTODELIVER implements Event {
        INSTANCE
    }
    public static enum DELIVER implements Event {
        INSTANCE
    }
    public static enum AVAILABLE implements Event {
        INSTANCE
    }
}
