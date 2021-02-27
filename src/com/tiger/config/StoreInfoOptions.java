package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class StoreInfoOptions{
    @JsonProperty("enableMultiKitchenOperations") 
    public boolean getEnableMultiKitchenOperations() { 
		 return this.enableMultiKitchenOperations; } 
    public void setEnableMultiKitchenOperations(boolean enableMultiKitchenOperations) { 
		 this.enableMultiKitchenOperations = enableMultiKitchenOperations; } 
    boolean enableMultiKitchenOperations;
}
