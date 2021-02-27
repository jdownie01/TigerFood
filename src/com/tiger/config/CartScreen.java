package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartScreen {
    LimitItemsByClassification limitItemsByClassification;
    CustomizeItem customizeItem;

    @JsonProperty("limitItemsByClassification")
    public LimitItemsByClassification getLimitItemsByClassification() {
        return this.limitItemsByClassification;
    }

    public void setLimitItemsByClassification(LimitItemsByClassification limitItemsByClassification) {
        this.limitItemsByClassification = limitItemsByClassification;
    }

    @JsonProperty("customizeItem")
    public CustomizeItem getCustomizeItem() {
        return this.customizeItem;
    }

    public void setCustomizeItem(CustomizeItem customizeItem) {
        this.customizeItem = customizeItem;
    }
}
