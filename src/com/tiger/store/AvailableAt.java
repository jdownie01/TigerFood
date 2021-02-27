package com.tiger.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableAt {
    String open;
    String close;
    int time;

    @JsonProperty("open")
    public String getOpen() {
        return this.open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    @JsonProperty("close")
    public String getClose() {
        return this.close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    @JsonProperty("time")
    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
