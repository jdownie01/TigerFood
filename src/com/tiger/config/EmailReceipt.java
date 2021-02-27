package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmailReceipt {
    String receiptFromName;
    String receiptFromAddress;
    String receiptSubject;
    boolean overrideFromStoreConfig;
    List<Object> customerAddress;
    boolean featureEnabled;

    @JsonProperty("receiptFromName")
    public String getReceiptFromName() {
        return this.receiptFromName;
    }

    public void setReceiptFromName(String receiptFromName) {
        this.receiptFromName = receiptFromName;
    }

    @JsonProperty("receiptFromAddress")
    public String getReceiptFromAddress() {
        return this.receiptFromAddress;
    }

    public void setReceiptFromAddress(String receiptFromAddress) {
        this.receiptFromAddress = receiptFromAddress;
    }

    @JsonProperty("receiptSubject")
    public String getReceiptSubject() {
        return this.receiptSubject;
    }

    public void setReceiptSubject(String receiptSubject) {
        this.receiptSubject = receiptSubject;
    }

    @JsonProperty("overrideFromStoreConfig")
    public boolean getOverrideFromStoreConfig() {
        return this.overrideFromStoreConfig;
    }

    public void setOverrideFromStoreConfig(boolean overrideFromStoreConfig) {
        this.overrideFromStoreConfig = overrideFromStoreConfig;
    }

    @JsonProperty("customerAddress")
    public List<Object> getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(List<Object> customerAddress) {
        this.customerAddress = customerAddress;
    }

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }
}
