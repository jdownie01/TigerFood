package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class StoreInfo{
    @JsonProperty("businessContextId") 
    public String getBusinessContextId() { 
		 return this.businessContextId; } 
    public void setBusinessContextId(String businessContextId) { 
		 this.businessContextId = businessContextId; } 
    String businessContextId;
    @JsonProperty("tenantId") 
    public String getTenantId() { 
		 return this.tenantId; } 
    public void setTenantId(String tenantId) { 
		 this.tenantId = tenantId; } 
    String tenantId;
    @JsonProperty("storeInfoId") 
    public String getStoreInfoId() { 
		 return this.storeInfoId; } 
    public void setStoreInfoId(String storeInfoId) { 
		 this.storeInfoId = storeInfoId; } 
    String storeInfoId;
    @JsonProperty("storeName") 
    public String getStoreName() { 
		 return this.storeName; } 
    public void setStoreName(String storeName) { 
		 this.storeName = storeName; } 
    String storeName;
    @JsonProperty("timezone") 
    public String getTimezone() { 
		 return this.timezone; } 
    public void setTimezone(String timezone) { 
		 this.timezone = timezone; } 
    String timezone;
    @JsonProperty("receiptFooterText") 
    public String getReceiptFooterText() { 
		 return this.receiptFooterText; } 
    public void setReceiptFooterText(String receiptFooterText) { 
		 this.receiptFooterText = receiptFooterText; } 
    String receiptFooterText;
    @JsonProperty("logoDetails") 
    public LogoDetails getLogoDetails() { 
		 return this.logoDetails; } 
    public void setLogoDetails(LogoDetails logoDetails) { 
		 this.logoDetails = logoDetails; } 
    LogoDetails logoDetails;
    @JsonProperty("properties") 
    public Properties getProperties() { 
		 return this.properties; } 
    public void setProperties(Properties properties) { 
		 this.properties = properties; } 
    Properties properties;
    @JsonProperty("storeInfoOptions") 
    public StoreInfoOptions getStoreInfoOptions() { 
		 return this.storeInfoOptions; } 
    public void setStoreInfoOptions(StoreInfoOptions storeInfoOptions) { 
		 this.storeInfoOptions = storeInfoOptions; } 
    StoreInfoOptions storeInfoOptions;
    @JsonProperty("taxIdentificationNumber") 
    public String getTaxIdentificationNumber() { 
		 return this.taxIdentificationNumber; } 
    public void setTaxIdentificationNumber(String taxIdentificationNumber) { 
		 this.taxIdentificationNumber = taxIdentificationNumber; } 
    String taxIdentificationNumber;
    @JsonProperty("address") 
    public List<String> getAddress() { 
		 return this.address; } 
    public void setAddress(List<String> address) { 
		 this.address = address; } 
    List<String> address;
    @JsonProperty("image") 
    public String getImage() { 
		 return this.image; } 
    public void setImage(String image) { 
		 this.image = image; } 
    String image;
    @JsonProperty("address1") 
    public String getAddress1() { 
		 return this.address1; } 
    public void setAddress1(String address1) { 
		 this.address1 = address1; } 
    String address1;
}
