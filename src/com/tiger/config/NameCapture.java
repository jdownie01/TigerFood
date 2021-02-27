package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameCapture {
    boolean guestNameRequired;
    String guestNameInstructionText;
    boolean featureEnabled;

    @JsonProperty("guestNameRequired")
    public boolean getGuestNameRequired() {
        return this.guestNameRequired;
    }

    public void setGuestNameRequired(boolean guestNameRequired) {
        this.guestNameRequired = guestNameRequired;
    }

    @JsonProperty("guestNameInstructionText")
    public String getGuestNameInstructionText() {
        return this.guestNameInstructionText;
    }

    public void setGuestNameInstructionText(String guestNameInstructionText) {
        this.guestNameInstructionText = guestNameInstructionText;
    }

    @JsonProperty("featureEnabled")
    public boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }
}
