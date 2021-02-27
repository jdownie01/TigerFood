package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class DineInConfig{
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
    @JsonProperty("kitchenText") 
    public String getKitchenText() { 
		 return this.kitchenText; } 
    public void setKitchenText(String kitchenText) { 
		 this.kitchenText = kitchenText; } 
    String kitchenText;
    @JsonProperty("buttonText") 
    public String getButtonText() { 
		 return this.buttonText; } 
    public void setButtonText(String buttonText) { 
		 this.buttonText = buttonText; } 
    String buttonText;
}
