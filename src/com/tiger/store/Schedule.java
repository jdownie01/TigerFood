package com.tiger.store;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {
    String c;
    String scheduledExpression;
    Properties properties;
    DisplayProfileState displayProfileState;

    @JsonProperty("@c")
    public String getC() {
        return this.c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("scheduledExpression")
    public String getScheduledExpression() {
        return this.scheduledExpression;
    }

    public void setScheduledExpression(String scheduledExpression) {
        this.scheduledExpression = scheduledExpression;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return this.properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("displayProfileState")
    public DisplayProfileState getDisplayProfileState() {
        return this.displayProfileState;
    }

    public void setDisplayProfileState(DisplayProfileState displayProfileState) {
        this.displayProfileState = displayProfileState;
    }
}
