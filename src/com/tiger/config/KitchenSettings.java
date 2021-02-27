package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class KitchenSettings{
    @JsonProperty("kitchenContextId") 
    public String getKitchenContextId() { 
		 return this.kitchenContextId; } 
    public void setKitchenContextId(String kitchenContextId) { 
		 this.kitchenContextId = kitchenContextId; } 
    String kitchenContextId;
}
