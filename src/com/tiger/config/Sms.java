package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Sms{
    @JsonProperty("isSmsEnabled") 
    public boolean getIsSmsEnabled() { 
		 return this.isSmsEnabled; } 
    public void setIsSmsEnabled(boolean isSmsEnabled) { 
		 this.isSmsEnabled = isSmsEnabled; } 
    boolean isSmsEnabled;
    @JsonProperty("isMobileNumberRequired") 
    public boolean getIsMobileNumberRequired() { 
		 return this.isMobileNumberRequired; } 
    public void setIsMobileNumberRequired(boolean isMobileNumberRequired) { 
		 this.isMobileNumberRequired = isMobileNumberRequired; } 
    boolean isMobileNumberRequired;
    @JsonProperty("countryCode") 
    public String getCountryCode() { 
		 return this.countryCode; } 
    public void setCountryCode(String countryCode) { 
		 this.countryCode = countryCode; } 
    String countryCode;
    @JsonProperty("regionCode") 
    public String getRegionCode() { 
		 return this.regionCode; } 
    public void setRegionCode(String regionCode) { 
		 this.regionCode = regionCode; } 
    String regionCode;
}
