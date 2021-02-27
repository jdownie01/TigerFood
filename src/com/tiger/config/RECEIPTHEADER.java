package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class RECEIPTHEADER{
    @JsonProperty("fileName") 
    public String getFileName() { 
		 return this.fileName; } 
    public void setFileName(String fileName) { 
		 this.fileName = fileName; } 
    String fileName;
}
