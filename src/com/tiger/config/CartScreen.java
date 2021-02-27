package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CartScreen{
    @JsonProperty("limitItemsByClassification") 
    public LimitItemsByClassification getLimitItemsByClassification() { 
		 return this.limitItemsByClassification; } 
    public void setLimitItemsByClassification(LimitItemsByClassification limitItemsByClassification) { 
		 this.limitItemsByClassification = limitItemsByClassification; } 
    LimitItemsByClassification limitItemsByClassification;
    @JsonProperty("customizeItem") 
    public CustomizeItem getCustomizeItem() { 
		 return this.customizeItem; } 
    public void setCustomizeItem(CustomizeItem customizeItem) { 
		 this.customizeItem = customizeItem; } 
    CustomizeItem customizeItem;
}
