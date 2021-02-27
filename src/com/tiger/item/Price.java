package com.tiger.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
    String currencyUnit;
    String amount;

    @JsonProperty("currencyUnit")
    public String getCurrencyUnit() {
        return this.currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
