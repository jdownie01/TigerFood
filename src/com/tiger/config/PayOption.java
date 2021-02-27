package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class PayOption{
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    @JsonProperty("paymentEnabled") 
    public boolean getPaymentEnabled() { 
		 return this.paymentEnabled; } 
    public void setPaymentEnabled(boolean paymentEnabled) { 
		 this.paymentEnabled = paymentEnabled; } 
    boolean paymentEnabled;
    @JsonProperty("displayLabel") 
    public String getDisplayLabel() { 
		 return this.displayLabel; } 
    public void setDisplayLabel(String displayLabel) { 
		 this.displayLabel = displayLabel; } 
    String displayLabel;
    @JsonProperty("autoDeduct") 
    public AutoDeduct getAutoDeduct() { 
		 return this.autoDeduct; } 
    public void setAutoDeduct(AutoDeduct autoDeduct) { 
		 this.autoDeduct = autoDeduct; } 
    AutoDeduct autoDeduct;
    @JsonProperty("manualDeduct") 
    public ManualDeduct getManualDeduct() { 
		 return this.manualDeduct; } 
    public void setManualDeduct(ManualDeduct manualDeduct) { 
		 this.manualDeduct = manualDeduct; } 
    ManualDeduct manualDeduct;
    @JsonProperty("instructionText") 
    public String getInstructionText() { 
		 return this.instructionText; } 
    public void setInstructionText(String instructionText) { 
		 this.instructionText = instructionText; } 
    String instructionText;
    @JsonProperty("accountNumberLabelText") 
    public String getAccountNumberLabelText() { 
		 return this.accountNumberLabelText; } 
    public void setAccountNumberLabelText(String accountNumberLabelText) { 
		 this.accountNumberLabelText = accountNumberLabelText; } 
    String accountNumberLabelText;
    @JsonProperty("secondaryVerificationLabelText") 
    public String getSecondaryVerificationLabelText() { 
		 return this.secondaryVerificationLabelText; } 
    public void setSecondaryVerificationLabelText(String secondaryVerificationLabelText) { 
		 this.secondaryVerificationLabelText = secondaryVerificationLabelText; } 
    String secondaryVerificationLabelText;
    @JsonProperty("secondaryVerificationType") 
    public String getSecondaryVerificationType() { 
		 return this.secondaryVerificationType; } 
    public void setSecondaryVerificationType(String secondaryVerificationType) { 
		 this.secondaryVerificationType = secondaryVerificationType; } 
    String secondaryVerificationType;
}
