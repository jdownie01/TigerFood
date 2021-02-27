package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class LoyaltyDetailsAccount{
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("enabled") 
    public boolean getEnabled() { 
		 return this.enabled; } 
    public void setEnabled(boolean enabled) { 
		 this.enabled = enabled; } 
    boolean enabled;
}
