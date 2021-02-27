package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Schedule{
    @JsonProperty("@c") 
    public String getC() { 
		 return this.c; } 
    public void setC(String c) { 
		 this.c = c; } 
    String c;
    @JsonProperty("scheduledExpression") 
    public String getScheduledExpression() { 
		 return this.scheduledExpression; } 
    public void setScheduledExpression(String scheduledExpression) { 
		 this.scheduledExpression = scheduledExpression; } 
    String scheduledExpression;
    @JsonProperty("properties") 
    public Properties getProperties() { 
		 return this.properties; } 
    public void setProperties(Properties properties) { 
		 this.properties = properties; } 
    Properties properties;
    @JsonProperty("displayProfileState") 
    public DisplayProfileState getDisplayProfileState() { 
		 return this.displayProfileState; } 
    public void setDisplayProfileState(DisplayProfileState displayProfileState) { 
		 this.displayProfileState = displayProfileState; } 
    DisplayProfileState displayProfileState;
}
