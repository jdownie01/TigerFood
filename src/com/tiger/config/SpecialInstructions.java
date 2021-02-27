package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class SpecialInstructions{
    @JsonProperty("headerText") 
    public String getHeaderText() { 
		 return this.headerText; } 
    public void setHeaderText(String headerText) { 
		 this.headerText = headerText; } 
    String headerText;
    @JsonProperty("instructionText") 
    public String getInstructionText() { 
		 return this.instructionText; } 
    public void setInstructionText(String instructionText) { 
		 this.instructionText = instructionText; } 
    String instructionText;
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
    @JsonProperty("characterLimit") 
    public int getCharacterLimit() { 
		 return this.characterLimit; } 
    public void setCharacterLimit(int characterLimit) { 
		 this.characterLimit = characterLimit; } 
    int characterLimit;
}
