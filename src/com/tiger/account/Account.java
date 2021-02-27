package com.tiger.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    String name;
    String balance;
    String currency;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("balance")
    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
