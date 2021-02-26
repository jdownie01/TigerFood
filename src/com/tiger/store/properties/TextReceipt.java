package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextReceipt {
    boolean featureEnabled;

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }
}
