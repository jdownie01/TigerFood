package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Properties{
    @JsonProperty("meal-period-id") 
    public String getMealPeriodId() { 
		 return this.mealPeriodId; } 
    public void setMealPeriodId(String mealPeriodId) { 
		 this.mealPeriodId = mealPeriodId; } 
    String mealPeriodId;
    @JsonProperty("price-level-id") 
    public Object getPriceLevelId() { 
		 return this.priceLevelId; } 
    public void setPriceLevelId(Object priceLevelId) { 
		 this.priceLevelId = priceLevelId; } 
    Object priceLevelId;
    @JsonProperty("TRANSITION_MESSAGE") 
    public String getTRANSITION_MESSAGE() { 
		 return this.tRANSITION_MESSAGE; } 
    public void setTRANSITION_MESSAGE(String tRANSITION_MESSAGE) { 
		 this.tRANSITION_MESSAGE = tRANSITION_MESSAGE; } 
    String tRANSITION_MESSAGE;
}
