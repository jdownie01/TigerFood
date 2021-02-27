package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CustomizeItem{
    @JsonProperty("isEnabled") 
    public boolean getIsEnabled() { 
		 return this.isEnabled; } 
    public void setIsEnabled(boolean isEnabled) { 
		 this.isEnabled = isEnabled; } 
    boolean isEnabled;
}
