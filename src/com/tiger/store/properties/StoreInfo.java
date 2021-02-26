package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StoreInfo {
    String businessContextId;
    String tenantId;
    String storeInfoId;
    String storeName;
    String timezone;
    String receiptFooterText;
    LogoDetails logoDetails;
    Properties properties;
    StoreInfoOptions storeInfoOptions;
    String taxIdentificationNumber;
    List<String> address;
    String image;
    String address1;

    @JsonProperty("businessContextId")
    public String getBusinessContextId() {
        return this.businessContextId;
    }

    public void setBusinessContextId(String businessContextId) {
        this.businessContextId = businessContextId;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("storeInfoId")
    public String getStoreInfoId() {
        return this.storeInfoId;
    }

    public void setStoreInfoId(String storeInfoId) {
        this.storeInfoId = storeInfoId;
    }

    @JsonProperty("storeName")
    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("receiptFooterText")
    public String getReceiptFooterText() {
        return this.receiptFooterText;
    }

    public void setReceiptFooterText(String receiptFooterText) {
        this.receiptFooterText = receiptFooterText;
    }

    @JsonProperty("logoDetails")
    public LogoDetails getLogoDetails() {
        return this.logoDetails;
    }

    public void setLogoDetails(LogoDetails logoDetails) {
        this.logoDetails = logoDetails;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return this.properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("storeInfoOptions")
    public StoreInfoOptions getStoreInfoOptions() {
        return this.storeInfoOptions;
    }

    public void setStoreInfoOptions(StoreInfoOptions storeInfoOptions) {
        this.storeInfoOptions = storeInfoOptions;
    }

    @JsonProperty("taxIdentificationNumber")
    public String getTaxIdentificationNumber() {
        return this.taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    @JsonProperty("address")
    public List<String> getAddress() {
        return this.address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @JsonProperty("image")
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}
