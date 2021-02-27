package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class ManualDeduct{
    @JsonProperty("isEnabled") 
    public boolean getIsEnabled() { 
		 return this.isEnabled; } 
    public void setIsEnabled(boolean isEnabled) { 
		 this.isEnabled = isEnabled; } 
    boolean isEnabled;
    @JsonProperty("displayName") 
    public String getDisplayName() { 
		 return this.displayName; } 
    public void setDisplayName(String displayName) { 
		 this.displayName = displayName; } 
    String displayName;
}
