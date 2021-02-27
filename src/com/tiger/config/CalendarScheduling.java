package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalendarScheduling {
    boolean featureEnabled;
    int minimumDays;
    int maximumDays;
    int daysToAdd;

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    @JsonProperty("minimumDays")
    public int getMinimumDays() {
        return this.minimumDays;
    }

    public void setMinimumDays(int minimumDays) {
        this.minimumDays = minimumDays;
    }

    @JsonProperty("maximumDays")
    public int getMaximumDays() {
        return this.maximumDays;
    }

    public void setMaximumDays(int maximumDays) {
        this.maximumDays = maximumDays;
    }

    @JsonProperty("daysToAdd")
    public int getDaysToAdd() {
        return this.daysToAdd;
    }

    public void setDaysToAdd(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }
}
