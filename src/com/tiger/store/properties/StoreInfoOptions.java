package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreInfoOptions {
    boolean enableMultiKitchenOperations;

    @JsonProperty("enableMultiKitchenOperations")
    public boolean getEnableMultiKitchenOperations() {
        return this.enableMultiKitchenOperations;
    }

    public void setEnableMultiKitchenOperations(boolean enableMultiKitchenOperations) {
        this.enableMultiKitchenOperations = enableMultiKitchenOperations;
    }
}
