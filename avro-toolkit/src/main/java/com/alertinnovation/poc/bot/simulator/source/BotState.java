package com.alertinnovation.poc.bot.simulator.source;

import java.util.List;

public class BotState {
    String timestamp;
    String botId;
    String botAddress;
    String pmuAddress;
    String toteId;
    String location;
    String telemetryStatuses;
    String positionSources;
    String componentStatuses;
    Boolean isParked;
    Boolean isPositionConfirmed;
    Integer rotation;
    Boolean isSleeping;
    String currentTask;
    List<String> queuedTasks;
    Integer batteryVoltage;
    String chargeState;
    Integer chargeRate;
    Integer chargeTarget;
    Integer amperage;
    String powerSupplyStatus;
    Float frontTemperature;
    Float frontHumidity;
    Float rearTemperature;
    Float rearHumidity;
    Float therm1Temperature;
    Float therm2Temperature;
    Float therm3Temperature;
    Float therm4Temperature;
    Integer acpVersion;
    String hwRevision;
    String fwRevision;
    String persisted;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public String getBotAddress() {
        return botAddress;
    }

    public void setBotAddress(String botAddress) {
        this.botAddress = botAddress;
    }

    public String getPmuAddress() {
        return pmuAddress;
    }

    public void setPmuAddress(String pmuAddress) {
        this.pmuAddress = pmuAddress;
    }

    public String getToteId() {
        return toteId;
    }

    public void setToteId(String toteId) {
        this.toteId = toteId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelemetryStatuses() {
        return telemetryStatuses;
    }

    public void setTelemetryStatuses(String telemetryStatuses) {
        this.telemetryStatuses = telemetryStatuses;
    }

    public String getPositionSources() {
        return positionSources;
    }

    public void setPositionSources(String positionSources) {
        this.positionSources = positionSources;
    }

    public String getComponentStatuses() {
        return componentStatuses;
    }

    public void setComponentStatuses(String componentStatuses) {
        this.componentStatuses = componentStatuses;
    }

    public Boolean getParked() {
        return isParked;
    }

    public void setParked(Boolean parked) {
        isParked = parked;
    }

    public Boolean getPositionConfirmed() {
        return isPositionConfirmed;
    }

    public void setPositionConfirmed(Boolean positionConfirmed) {
        isPositionConfirmed = positionConfirmed;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public Boolean getSleeping() {
        return isSleeping;
    }

    public void setSleeping(Boolean sleeping) {
        isSleeping = sleeping;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask = currentTask;
    }

    public List<String> getQueuedTasks() {
        return queuedTasks;
    }

    public void setQueuedTasks(List<String> queuedTasks) {
        this.queuedTasks = queuedTasks;
    }

    public Integer getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(Integer batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public String getChargeState() {
        return chargeState;
    }

    public void setChargeState(String chargeState) {
        this.chargeState = chargeState;
    }

    public Integer getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(Integer chargeRate) {
        this.chargeRate = chargeRate;
    }

    public Integer getChargeTarget() {
        return chargeTarget;
    }

    public void setChargeTarget(Integer chargeTarget) {
        this.chargeTarget = chargeTarget;
    }

    public Integer getAmperage() {
        return amperage;
    }

    public void setAmperage(Integer amperage) {
        this.amperage = amperage;
    }

    public String getPowerSupplyStatus() {
        return powerSupplyStatus;
    }

    public void setPowerSupplyStatus(String powerSupplyStatus) {
        this.powerSupplyStatus = powerSupplyStatus;
    }

    public Float getFrontTemperature() {
        return frontTemperature;
    }

    public void setFrontTemperature(Float frontTemperature) {
        this.frontTemperature = frontTemperature;
    }

    public Float getFrontHumidity() {
        return frontHumidity;
    }

    public void setFrontHumidity(Float frontHumidity) {
        this.frontHumidity = frontHumidity;
    }

    public Float getRearTemperature() {
        return rearTemperature;
    }

    public void setRearTemperature(Float rearTemperature) {
        this.rearTemperature = rearTemperature;
    }

    public Float getRearHumidity() {
        return rearHumidity;
    }

    public void setRearHumidity(Float rearHumidity) {
        this.rearHumidity = rearHumidity;
    }

    public Float getTherm1Temperature() {
        return therm1Temperature;
    }

    public void setTherm1Temperature(Float therm1Temperature) {
        this.therm1Temperature = therm1Temperature;
    }

    public Float getTherm2Temperature() {
        return therm2Temperature;
    }

    public void setTherm2Temperature(Float therm2Temperature) {
        this.therm2Temperature = therm2Temperature;
    }

    public Float getTherm3Temperature() {
        return therm3Temperature;
    }

    public void setTherm3Temperature(Float therm3Temperature) {
        this.therm3Temperature = therm3Temperature;
    }

    public Float getTherm4Temperature() {
        return therm4Temperature;
    }

    public void setTherm4Temperature(Float therm4Temperature) {
        this.therm4Temperature = therm4Temperature;
    }

    public Integer getAcpVersion() {
        return acpVersion;
    }

    public void setAcpVersion(Integer acpVersion) {
        this.acpVersion = acpVersion;
    }

    public String getHwRevision() {
        return hwRevision;
    }

    public void setHwRevision(String hwRevision) {
        this.hwRevision = hwRevision;
    }

    public String getFwRevision() {
        return fwRevision;
    }

    public void setFwRevision(String fwRevision) {
        this.fwRevision = fwRevision;
    }

    public String getPersisted() {
        return persisted;
    }

    public void setPersisted(String persisted) {
        this.persisted = persisted;
    }
}