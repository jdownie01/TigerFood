package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoyaltyDetailsAccount {
    String id;
    boolean enabled;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("enabled")
    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
