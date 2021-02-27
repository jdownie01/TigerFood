package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class NameCapture{
    @JsonProperty("guestNameRequired") 
    public boolean getGuestNameRequired() { 
		 return this.guestNameRequired; } 
    public void setGuestNameRequired(boolean guestNameRequired) { 
		 this.guestNameRequired = guestNameRequired; } 
    boolean guestNameRequired;
    @JsonProperty("guestNameInstructionText") 
    public String getGuestNameInstructionText() { 
		 return this.guestNameInstructionText; } 
    public void setGuestNameInstructionText(String guestNameInstructionText) { 
		 this.guestNameInstructionText = guestNameInstructionText; } 
    String guestNameInstructionText;
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
}
