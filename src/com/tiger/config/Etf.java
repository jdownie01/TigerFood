package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Etf{
    @JsonProperty("etfEnabled") 
    public boolean getEtfEnabled() { 
		 return this.etfEnabled; } 
    public void setEtfEnabled(boolean etfEnabled) { 
		 this.etfEnabled = etfEnabled; } 
    boolean etfEnabled;
    @JsonProperty("varianceEnabled") 
    public boolean getVarianceEnabled() { 
		 return this.varianceEnabled; } 
    public void setVarianceEnabled(boolean varianceEnabled) { 
		 this.varianceEnabled = varianceEnabled; } 
    boolean varianceEnabled;
    @JsonProperty("variancePercentage") 
    public int getVariancePercentage() { 
		 return this.variancePercentage; } 
    public void setVariancePercentage(int variancePercentage) { 
		 this.variancePercentage = variancePercentage; } 
    int variancePercentage;
}
