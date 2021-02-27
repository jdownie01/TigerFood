package com.tiger.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account{
    @JsonProperty("name")
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("balance") 
    public String getBalance() { 
		 return this.balance; } 
    public void setBalance(String balance) { 
		 this.balance = balance; } 
    String balance;
    @JsonProperty("currency") 
    public String getCurrency() { 
		 return this.currency; } 
    public void setCurrency(String currency) { 
		 this.currency = currency; } 
    String currency;
}
