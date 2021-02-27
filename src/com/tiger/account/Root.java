package com.tiger.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root{
    @JsonProperty("tenderId")
    public String getTenderId() { 
		 return this.tenderId; } 
    public void setTenderId(String tenderId) { 
		 this.tenderId = tenderId; } 
    String tenderId;
    @JsonProperty("txid") 
    public int getTxid() { 
		 return this.txid; } 
    public void setTxid(int txid) { 
		 this.txid = txid; } 
    int txid;
    @JsonProperty("approved") 
    public int getApproved() { 
		 return this.approved; } 
    public void setApproved(int approved) { 
		 this.approved = approved; } 
    int approved;
    @JsonProperty("code") 
    public String getCode() { 
		 return this.code; } 
    public void setCode(String code) { 
		 this.code = code; } 
    String code;
    @JsonProperty("message") 
    public String getMessage() { 
		 return this.message; } 
    public void setMessage(String message) { 
		 this.message = message; } 
    String message;
    @JsonProperty("time") 
    public Object getTime() { 
		 return this.time; } 
    public void setTime(Object time) { 
		 this.time = time; } 
    Object time;
    @JsonProperty("amount") 
    public Amount getAmount() { 
		 return this.amount; } 
    public void setAmount(Amount amount) { 
		 this.amount = amount; } 
    Amount amount;
    @JsonProperty("accounts") 
    public List<Account> getAccounts() {
		 return this.accounts; } 
    public void setAccounts(List<Account> accounts) { 
		 this.accounts = accounts; } 
    List<Account> accounts;
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    @JsonProperty("taxRemoved") 
    public boolean getTaxRemoved() { 
		 return this.taxRemoved; } 
    public void setTaxRemoved(boolean taxRemoved) { 
		 this.taxRemoved = taxRemoved; } 
    boolean taxRemoved;
}
