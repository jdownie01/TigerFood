package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Properties{
    @JsonProperty("selectedLanguage") 
    public String getSelectedLanguage() { 
		 return this.selectedLanguage; } 
    public void setSelectedLanguage(String selectedLanguage) { 
		 this.selectedLanguage = selectedLanguage; } 
    String selectedLanguage;
    @JsonProperty("taxIdentificationNumber") 
    public String getTaxIdentificationNumber() { 
		 return this.taxIdentificationNumber; } 
    public void setTaxIdentificationNumber(String taxIdentificationNumber) { 
		 this.taxIdentificationNumber = taxIdentificationNumber; } 
    String taxIdentificationNumber;
}
