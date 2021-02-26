package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllAvailableList {
    String day;
    int index;
    AvailableAt availableAt;

    @JsonProperty("day")
    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @JsonProperty("index")
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @JsonProperty("availableAt")
    public AvailableAt getAvailableAt() {
        return this.availableAt;
    }

    public void setAvailableAt(AvailableAt availableAt) {
        this.availableAt = availableAt;
    }
}
