package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AvailableAt {
    String opens;
    String closes;
    boolean availableNow;
    boolean conceptsAvailableNow;
    int closingIn;
    List<OpenWindowTimeFrame> openWindowTimeFrames;

    @JsonProperty("opens")
    public String getOpens() {
        return this.opens;
    }

    public void setOpens(String opens) {
        this.opens = opens;
    }

    @JsonProperty("closes")
    public String getCloses() {
        return this.closes;
    }

    public void setCloses(String closes) {
        this.closes = closes;
    }

    @JsonProperty("availableNow")
    public boolean getAvailableNow() {
        return this.availableNow;
    }

    public void setAvailableNow(boolean availableNow) {
        this.availableNow = availableNow;
    }

    @JsonProperty("conceptsAvailableNow")
    public boolean getConceptsAvailableNow() {
        return this.conceptsAvailableNow;
    }

    public void setConceptsAvailableNow(boolean conceptsAvailableNow) {
        this.conceptsAvailableNow = conceptsAvailableNow;
    }

    @JsonProperty("closingIn")
    public int getClosingIn() {
        return this.closingIn;
    }

    public void setClosingIn(int closingIn) {
        this.closingIn = closingIn;
    }

    @JsonProperty("openWindowTimeFrames")
    public List<OpenWindowTimeFrame> getOpenWindowTimeFrames() {
        return this.openWindowTimeFrames;
    }

    public void setOpenWindowTimeFrames(List<OpenWindowTimeFrame> openWindowTimeFrames) {
        this.openWindowTimeFrames = openWindowTimeFrames;
    }
}
