package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class LoyaltyDetails{
    @JsonProperty("loyaltyDetailsAccounts") 
    public List<LoyaltyDetailsAccount> getLoyaltyDetailsAccounts() { 
		 return this.loyaltyDetailsAccounts; } 
    public void setLoyaltyDetailsAccounts(List<LoyaltyDetailsAccount> loyaltyDetailsAccounts) { 
		 this.loyaltyDetailsAccounts = loyaltyDetailsAccounts; } 
    List<LoyaltyDetailsAccount> loyaltyDetailsAccounts;
}
