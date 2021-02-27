package com.tiger.item; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class _1{
    @JsonProperty("priceLevelId") 
    public String getPriceLevelId() { 
		 return this.priceLevelId; } 
    public void setPriceLevelId(String priceLevelId) { 
		 this.priceLevelId = priceLevelId; } 
    String priceLevelId;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("price") 
    public Price getPrice() { 
		 return this.price; } 
    public void setPrice(Price price) { 
		 this.price = price; } 
    Price price;
}
