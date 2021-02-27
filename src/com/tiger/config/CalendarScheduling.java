package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CalendarScheduling{
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
    @JsonProperty("minimumDays") 
    public int getMinimumDays() { 
		 return this.minimumDays; } 
    public void setMinimumDays(int minimumDays) { 
		 this.minimumDays = minimumDays; } 
    int minimumDays;
    @JsonProperty("maximumDays") 
    public int getMaximumDays() { 
		 return this.maximumDays; } 
    public void setMaximumDays(int maximumDays) { 
		 this.maximumDays = maximumDays; } 
    int maximumDays;
    @JsonProperty("daysToAdd") 
    public int getDaysToAdd() { 
		 return this.daysToAdd; } 
    public void setDaysToAdd(int daysToAdd) { 
		 this.daysToAdd = daysToAdd; } 
    int daysToAdd;
}
