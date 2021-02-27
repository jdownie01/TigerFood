package com.tiger.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amount{
    @JsonProperty("remaining")
    public String getRemaining() { 
		 return this.remaining; } 
    public void setRemaining(String remaining) { 
		 this.remaining = remaining; } 
    String remaining;
    @JsonProperty("currency") 
    public String getCurrency() { 
		 return this.currency; } 
    public void setCurrency(String currency) { 
		 this.currency = currency; } 
    String currency;
    @JsonProperty("applied") 
    public String getApplied() { 
		 return this.applied; } 
    public void setApplied(String applied) { 
		 this.applied = applied; } 
    String applied;
    @JsonProperty("total") 
    public String getTotal() { 
		 return this.total; } 
    public void setTotal(String total) { 
		 this.total = total; } 
    String total;
}
