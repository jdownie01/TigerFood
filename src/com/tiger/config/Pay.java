package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Pay{
    @JsonProperty("iFrameApi") 
    public String getIFrameApi() { 
		 return this.iFrameApi; } 
    public void setIFrameApi(String iFrameApi) { 
		 this.iFrameApi = iFrameApi; } 
    String iFrameApi;
    @JsonProperty("paymentsEnabled") 
    public boolean getPaymentsEnabled() { 
		 return this.paymentsEnabled; } 
    public void setPaymentsEnabled(boolean paymentsEnabled) { 
		 this.paymentsEnabled = paymentsEnabled; } 
    boolean paymentsEnabled;
    @JsonProperty("iFrameTenantID") 
    public String getIFrameTenantID() { 
		 return this.iFrameTenantID; } 
    public void setIFrameTenantID(String iFrameTenantID) { 
		 this.iFrameTenantID = iFrameTenantID; } 
    String iFrameTenantID;
    @JsonProperty("clientId") 
    public String getClientId() { 
		 return this.clientId; } 
    public void setClientId(String clientId) { 
		 this.clientId = clientId; } 
    String clientId;
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
    @JsonProperty("subInstructionText") 
    public String getSubInstructionText() { 
		 return this.subInstructionText; } 
    public void setSubInstructionText(String subInstructionText) { 
		 this.subInstructionText = subInstructionText; } 
    String subInstructionText;
    @JsonProperty("payOptions") 
    public List<PayOption> getPayOptions() { 
		 return this.payOptions; } 
    public void setPayOptions(List<PayOption> payOptions) { 
		 this.payOptions = payOptions; } 
    List<PayOption> payOptions;
    @JsonProperty("stripeConfig") 
    public StripeConfig getStripeConfig() { 
		 return this.stripeConfig; } 
    public void setStripeConfig(StripeConfig stripeConfig) { 
		 this.stripeConfig = stripeConfig; } 
    StripeConfig stripeConfig;
}
