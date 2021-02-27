package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class PickUpConfig{
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
    @JsonProperty("conceptEntries") 
    public ConceptEntries getConceptEntries() { 
		 return this.conceptEntries; } 
    public void setConceptEntries(ConceptEntries conceptEntries) { 
		 this.conceptEntries = conceptEntries; } 
    ConceptEntries conceptEntries;
    @JsonProperty("conceptEntriesOrderArray") 
    public List<String> getConceptEntriesOrderArray() { 
		 return this.conceptEntriesOrderArray; } 
    public void setConceptEntriesOrderArray(List<String> conceptEntriesOrderArray) { 
		 this.conceptEntriesOrderArray = conceptEntriesOrderArray; } 
    List<String> conceptEntriesOrderArray;
    @JsonProperty("defaultConfirmationText") 
    public String getDefaultConfirmationText() { 
		 return this.defaultConfirmationText; } 
    public void setDefaultConfirmationText(String defaultConfirmationText) { 
		 this.defaultConfirmationText = defaultConfirmationText; } 
    String defaultConfirmationText;
}
