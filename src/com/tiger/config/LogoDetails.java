package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class LogoDetails{
    @JsonProperty("RECEIPT_HEADER") 
    public RECEIPTHEADER getRECEIPT_HEADER() { 
		 return this.rECEIPT_HEADER; } 
    public void setRECEIPT_HEADER(RECEIPTHEADER rECEIPT_HEADER) { 
		 this.rECEIPT_HEADER = rECEIPT_HEADER; } 
    RECEIPTHEADER rECEIPT_HEADER;
}
