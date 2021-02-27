package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
public class AvailableAt{
    @JsonProperty("open") 
    public String getOpen() { 
		 return this.open; } 
    public void setOpen(String open) { 
		 this.open = open; } 
    String open;
    @JsonProperty("close") 
    public String getClose() { 
		 return this.close; } 
    public void setClose(String close) { 
		 this.close = close; } 
    String close;
    @JsonProperty("time") 
    public int getTime() { 
		 return this.time; } 
    public void setTime(int time) { 
		 this.time = time; } 
    int time;
}
