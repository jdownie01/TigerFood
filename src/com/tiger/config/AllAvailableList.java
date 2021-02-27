package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class AllAvailableList{
    @JsonProperty("day") 
    public String getDay() { 
		 return this.day; } 
    public void setDay(String day) { 
		 this.day = day; } 
    String day;
    @JsonProperty("index") 
    public int getIndex() { 
		 return this.index; } 
    public void setIndex(int index) { 
		 this.index = index; } 
    int index;
    @JsonProperty("availableAt") 
    public AvailableAt getAvailableAt() { 
		 return this.availableAt; } 
    public void setAvailableAt(AvailableAt availableAt) { 
		 this.availableAt = availableAt; } 
    AvailableAt availableAt;
}
