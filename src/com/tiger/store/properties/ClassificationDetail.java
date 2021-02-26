package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClassificationDetail {
    String classifiedBy;
    int maxItems;
    String alertHeaderText;
    String alertInstructionText;
    List<Object> revenueCategoryIds;
    List<Object> productClassIds;

    @JsonProperty("classifiedBy")
    public String getClassifiedBy() {
        return this.classifiedBy;
    }

    public void setClassifiedBy(String classifiedBy) {
        this.classifiedBy = classifiedBy;
    }

    @JsonProperty("maxItems")
    public int getMaxItems() {
        return this.maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    @JsonProperty("alertHeaderText")
    public String getAlertHeaderText() {
        return this.alertHeaderText;
    }

    public void setAlertHeaderText(String alertHeaderText) {
        this.alertHeaderText = alertHeaderText;
    }

    @JsonProperty("alertInstructionText")
    public String getAlertInstructionText() {
        return this.alertInstructionText;
    }

    public void setAlertInstructionText(String alertInstructionText) {
        this.alertInstructionText = alertInstructionText;
    }

    @JsonProperty("revenueCategoryIds")
    public List<Object> getRevenueCategoryIds() {
        return this.revenueCategoryIds;
    }

    public void setRevenueCategoryIds(List<Object> revenueCategoryIds) {
        this.revenueCategoryIds = revenueCategoryIds;
    }

    @JsonProperty("productClassIds")
    public List<Object> getProductClassIds() {
        return this.productClassIds;
    }

    public void setProductClassIds(List<Object> productClassIds) {
        this.productClassIds = productClassIds;
    }
}
