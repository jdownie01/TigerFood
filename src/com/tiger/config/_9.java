package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class _9{
    @JsonProperty("tenderType") 
    public String getTenderType() { 
		 return this.tenderType; } 
    public void setTenderType(String tenderType) { 
		 this.tenderType = tenderType; } 
    String tenderType;
    @JsonProperty("displayName") 
    public String getDisplayName() { 
		 return this.displayName; } 
    public void setDisplayName(String displayName) { 
		 this.displayName = displayName; } 
    String displayName;
    @JsonProperty("taxableTenderId") 
    public String getTaxableTenderId() { 
		 return this.taxableTenderId; } 
    public void setTaxableTenderId(String taxableTenderId) { 
		 this.taxableTenderId = taxableTenderId; } 
    String taxableTenderId;
    @JsonProperty("taxExemptTenderId") 
    public String getTaxExemptTenderId() { 
		 return this.taxExemptTenderId; } 
    public void setTaxExemptTenderId(String taxExemptTenderId) { 
		 this.taxExemptTenderId = taxExemptTenderId; } 
    String taxExemptTenderId;
    @JsonProperty("isDefault") 
    public boolean getIsDefault() { 
		 return this.isDefault; } 
    public void setIsDefault(boolean isDefault) { 
		 this.isDefault = isDefault; } 
    boolean isDefault;
    @JsonProperty("atriumTenderId") 
    public String getAtriumTenderId() { 
		 return this.atriumTenderId; } 
    public void setAtriumTenderId(String atriumTenderId) { 
		 this.atriumTenderId = atriumTenderId; } 
    String atriumTenderId;
}
