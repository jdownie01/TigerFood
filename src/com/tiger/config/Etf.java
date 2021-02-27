package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Etf {
    boolean etfEnabled;
    boolean varianceEnabled;
    int variancePercentage;

    @JsonProperty("etfEnabled")
    public boolean getEtfEnabled() {
        return this.etfEnabled;
    }

    public void setEtfEnabled(boolean etfEnabled) {
        this.etfEnabled = etfEnabled;
    }

    @JsonProperty("varianceEnabled")
    public boolean getVarianceEnabled() {
        return this.varianceEnabled;
    }

    public void setVarianceEnabled(boolean varianceEnabled) {
        this.varianceEnabled = varianceEnabled;
    }

    @JsonProperty("variancePercentage")
    public int getVariancePercentage() {
        return this.variancePercentage;
    }

    public void setVariancePercentage(int variancePercentage) {
        this.variancePercentage = variancePercentage;
    }
}
