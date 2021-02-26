package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayOption {
    String type;
    boolean paymentEnabled;
    String displayLabel;
    AutoDeduct autoDeduct;
    ManualDeduct manualDeduct;
    String instructionText;
    String accountNumberLabelText;
    String secondaryVerificationLabelText;
    String secondaryVerificationType;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("paymentEnabled")
    public boolean getPaymentEnabled() {
        return this.paymentEnabled;
    }

    public void setPaymentEnabled(boolean paymentEnabled) {
        this.paymentEnabled = paymentEnabled;
    }

    @JsonProperty("displayLabel")
    public String getDisplayLabel() {
        return this.displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    @JsonProperty("autoDeduct")
    public AutoDeduct getAutoDeduct() {
        return this.autoDeduct;
    }

    public void setAutoDeduct(AutoDeduct autoDeduct) {
        this.autoDeduct = autoDeduct;
    }

    @JsonProperty("manualDeduct")
    public ManualDeduct getManualDeduct() {
        return this.manualDeduct;
    }

    public void setManualDeduct(ManualDeduct manualDeduct) {
        this.manualDeduct = manualDeduct;
    }

    @JsonProperty("instructionText")
    public String getInstructionText() {
        return this.instructionText;
    }

    public void setInstructionText(String instructionText) {
        this.instructionText = instructionText;
    }

    @JsonProperty("accountNumberLabelText")
    public String getAccountNumberLabelText() {
        return this.accountNumberLabelText;
    }

    public void setAccountNumberLabelText(String accountNumberLabelText) {
        this.accountNumberLabelText = accountNumberLabelText;
    }

    @JsonProperty("secondaryVerificationLabelText")
    public String getSecondaryVerificationLabelText() {
        return this.secondaryVerificationLabelText;
    }

    public void setSecondaryVerificationLabelText(String secondaryVerificationLabelText) {
        this.secondaryVerificationLabelText = secondaryVerificationLabelText;
    }

    @JsonProperty("secondaryVerificationType")
    public String getSecondaryVerificationType() {
        return this.secondaryVerificationType;
    }

    public void setSecondaryVerificationType(String secondaryVerificationType) {
        this.secondaryVerificationType = secondaryVerificationType;
    }
}
