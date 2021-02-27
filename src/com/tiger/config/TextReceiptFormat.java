package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class TextReceiptFormat{
    @JsonProperty("introText") 
    public String getIntroText() { 
		 return this.introText; } 
    public void setIntroText(String introText) { 
		 this.introText = introText; } 
    String introText;
    @JsonProperty("overrideFromStoreConfig") 
    public boolean getOverrideFromStoreConfig() { 
		 return this.overrideFromStoreConfig; } 
    public void setOverrideFromStoreConfig(boolean overrideFromStoreConfig) { 
		 this.overrideFromStoreConfig = overrideFromStoreConfig; } 
    boolean overrideFromStoreConfig;
    @JsonProperty("isItemizedListEnabled") 
    public boolean getIsItemizedListEnabled() { 
		 return this.isItemizedListEnabled; } 
    public void setIsItemizedListEnabled(boolean isItemizedListEnabled) { 
		 this.isItemizedListEnabled = isItemizedListEnabled; } 
    boolean isItemizedListEnabled;
    @JsonProperty("isTotalsEnabled") 
    public boolean getIsTotalsEnabled() { 
		 return this.isTotalsEnabled; } 
    public void setIsTotalsEnabled(boolean isTotalsEnabled) { 
		 this.isTotalsEnabled = isTotalsEnabled; } 
    boolean isTotalsEnabled;
    @JsonProperty("isIntroEnabled") 
    public boolean getIsIntroEnabled() { 
		 return this.isIntroEnabled; } 
    public void setIsIntroEnabled(boolean isIntroEnabled) { 
		 this.isIntroEnabled = isIntroEnabled; } 
    boolean isIntroEnabled;
}
