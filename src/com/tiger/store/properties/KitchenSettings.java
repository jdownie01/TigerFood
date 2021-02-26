package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KitchenSettings {
    String kitchenContextId;

    @JsonProperty("kitchenContextId")
    public String getKitchenContextId() {
        return this.kitchenContextId;
    }

    public void setKitchenContextId(String kitchenContextId) {
        this.kitchenContextId = kitchenContextId;
    }
}
