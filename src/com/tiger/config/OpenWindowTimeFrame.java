package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class OpenWindowTimeFrame{
    @JsonProperty("opens") 
    public String getOpens() { 
		 return this.opens; } 
    public void setOpens(String opens) { 
		 this.opens = opens; } 
    String opens;
    @JsonProperty("closes") 
    public String getCloses() { 
		 return this.closes; } 
    public void setCloses(String closes) { 
		 this.closes = closes; } 
    String closes;
}
