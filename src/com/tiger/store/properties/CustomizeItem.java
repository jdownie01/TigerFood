package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomizeItem {
    boolean isEnabled;

    @JsonProperty("isEnabled")
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
}
