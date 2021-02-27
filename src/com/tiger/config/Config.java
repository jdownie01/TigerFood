package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {
    String publishableKey;
    String countryCode;

    @JsonProperty("publishableKey")
    public String getPublishableKey() {
        return this.publishableKey;
    }

    public void setPublishableKey(String publishableKey) {
        this.publishableKey = publishableKey;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
