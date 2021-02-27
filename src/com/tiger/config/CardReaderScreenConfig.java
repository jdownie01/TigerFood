package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class CardReaderScreenConfig{
    @JsonProperty("topInstructionText") 
    public String getTopInstructionText() { 
		 return this.topInstructionText; } 
    public void setTopInstructionText(String topInstructionText) { 
		 this.topInstructionText = topInstructionText; } 
    String topInstructionText;
}
