package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialInstructions {
    String headerText;
    String instructionText;
    boolean featureEnabled;
    int characterLimit;

    @JsonProperty("headerText")
    public String getHeaderText() {
        return this.headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    @JsonProperty("instructionText")
    public String getInstructionText() {
        return this.instructionText;
    }

    public void setInstructionText(String instructionText) {
        this.instructionText = instructionText;
    }

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    @JsonProperty("characterLimit")
    public int getCharacterLimit() {
        return this.characterLimit;
    }

    public void setCharacterLimit(int characterLimit) {
        this.characterLimit = characterLimit;
    }
}
