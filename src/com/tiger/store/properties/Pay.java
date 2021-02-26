package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pay {
    String iFrameApi;
    boolean paymentsEnabled;
    String iFrameTenantID;
    String clientId;
    String headerText;
    String instructionText;
    String subInstructionText;
    List<PayOption> payOptions;
    StripeConfig stripeConfig;

    @JsonProperty("iFrameApi")
    public String getIFrameApi() {
        return this.iFrameApi;
    }

    public void setIFrameApi(String iFrameApi) {
        this.iFrameApi = iFrameApi;
    }

    @JsonProperty("paymentsEnabled")
    public boolean getPaymentsEnabled() {
        return this.paymentsEnabled;
    }

    public void setPaymentsEnabled(boolean paymentsEnabled) {
        this.paymentsEnabled = paymentsEnabled;
    }

    @JsonProperty("iFrameTenantID")
    public String getIFrameTenantID() {
        return this.iFrameTenantID;
    }

    public void setIFrameTenantID(String iFrameTenantID) {
        this.iFrameTenantID = iFrameTenantID;
    }

    @JsonProperty("clientId")
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

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

    @JsonProperty("subInstructionText")
    public String getSubInstructionText() {
        return this.subInstructionText;
    }

    public void setSubInstructionText(String subInstructionText) {
        this.subInstructionText = subInstructionText;
    }

    @JsonProperty("payOptions")
    public List<PayOption> getPayOptions() {
        return this.payOptions;
    }

    public void setPayOptions(List<PayOption> payOptions) {
        this.payOptions = payOptions;
    }

    @JsonProperty("stripeConfig")
    public StripeConfig getStripeConfig() {
        return this.stripeConfig;
    }

    public void setStripeConfig(StripeConfig stripeConfig) {
        this.stripeConfig = stripeConfig;
    }
}
