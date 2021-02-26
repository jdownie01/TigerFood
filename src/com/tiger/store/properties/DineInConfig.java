package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DineInConfig {
    boolean featureEnabled;
    String kitchenText;
    String buttonText;

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    @JsonProperty("kitchenText")
    public String getKitchenText() {
        return this.kitchenText;
    }

    public void setKitchenText(String kitchenText) {
        this.kitchenText = kitchenText;
    }

    @JsonProperty("buttonText")
    public String getButtonText() {
        return this.buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }
}
