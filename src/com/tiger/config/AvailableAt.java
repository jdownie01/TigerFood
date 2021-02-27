package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class AvailableAt{
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
    @JsonProperty("availableNow") 
    public boolean getAvailableNow() { 
		 return this.availableNow; } 
    public void setAvailableNow(boolean availableNow) { 
		 this.availableNow = availableNow; } 
    boolean availableNow;
    @JsonProperty("conceptsAvailableNow") 
    public boolean getConceptsAvailableNow() { 
		 return this.conceptsAvailableNow; } 
    public void setConceptsAvailableNow(boolean conceptsAvailableNow) { 
		 this.conceptsAvailableNow = conceptsAvailableNow; } 
    boolean conceptsAvailableNow;
    @JsonProperty("closingIn") 
    public int getClosingIn() { 
		 return this.closingIn; } 
    public void setClosingIn(int closingIn) { 
		 this.closingIn = closingIn; } 
    int closingIn;
    @JsonProperty("openWindowTimeFrames") 
    public List<OpenWindowTimeFrame> getOpenWindowTimeFrames() { 
		 return this.openWindowTimeFrames; } 
    public void setOpenWindowTimeFrames(List<OpenWindowTimeFrame> openWindowTimeFrames) { 
		 this.openWindowTimeFrames = openWindowTimeFrames; } 
    List<OpenWindowTimeFrame> openWindowTimeFrames;
}
