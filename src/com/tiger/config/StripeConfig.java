package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class StripeConfig{
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
    @JsonProperty("config") 
    public Config getConfig() { 
		 return this.config; } 
    public void setConfig(Config config) { 
		 this.config = config; } 
    Config config;
}
