package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class TextReceipt{
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
}
