package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PickUpConfig {
    boolean featureEnabled;
    String kitchenText;
    String buttonText;
    ConceptEntries conceptEntries;
    List<String> conceptEntriesOrderArray;
    String defaultConfirmationText;

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    @JsonProperty("kitchenText")
    public String getKitchenText() {
        return this.kitchenText;
    }

    public void setKitchenText(String kitchenText) {
        this.kitchenText = kitchenText;
    }

    @JsonProperty("buttonText")
    public String getButtonText() {
        return this.buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @JsonProperty("conceptEntries")
    public ConceptEntries getConceptEntries() {
        return this.conceptEntries;
    }

    public void setConceptEntries(ConceptEntries conceptEntries) {
        this.conceptEntries = conceptEntries;
    }

    @JsonProperty("conceptEntriesOrderArray")
    public List<String> getConceptEntriesOrderArray() {
        return this.conceptEntriesOrderArray;
    }

    public void setConceptEntriesOrderArray(List<String> conceptEntriesOrderArray) {
        this.conceptEntriesOrderArray = conceptEntriesOrderArray;
    }

    @JsonProperty("defaultConfirmationText")
    public String getDefaultConfirmationText() {
        return this.defaultConfirmationText;
    }

    public void setDefaultConfirmationText(String defaultConfirmationText) {
        this.defaultConfirmationText = defaultConfirmationText;
    }
}
