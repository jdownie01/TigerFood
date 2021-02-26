package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LoyaltyDetails {
    List<LoyaltyDetailsAccount> loyaltyDetailsAccounts;

    @JsonProperty("loyaltyDetailsAccounts")
    public List<LoyaltyDetailsAccount> getLoyaltyDetailsAccounts() {
        return this.loyaltyDetailsAccounts;
    }

    public void setLoyaltyDetailsAccounts(List<LoyaltyDetailsAccount> loyaltyDetailsAccounts) {
        this.loyaltyDetailsAccounts = loyaltyDetailsAccounts;
    }
}
