package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Config{
    @JsonProperty("publishableKey") 
    public String getPublishableKey() { 
		 return this.publishableKey; } 
    public void setPublishableKey(String publishableKey) { 
		 this.publishableKey = publishableKey; } 
    String publishableKey;
    @JsonProperty("countryCode") 
    public String getCountryCode() { 
		 return this.countryCode; } 
    public void setCountryCode(String countryCode) { 
		 this.countryCode = countryCode; } 
    String countryCode;
}
