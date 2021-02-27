package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
public class ConceptOptions{
    @JsonProperty("profitCenterId") 
    public String getProfitCenterId() { 
		 return this.profitCenterId; } 
    public void setProfitCenterId(String profitCenterId) { 
		 this.profitCenterId = profitCenterId; } 
    String profitCenterId;
    @JsonProperty("displayText") 
    public String getDisplayText() { 
		 return this.displayText; } 
    public void setDisplayText(String displayText) { 
		 this.displayText = displayText; } 
    String displayText;
    @JsonProperty("showLogo") 
    public String getShowLogo() { 
		 return this.showLogo; } 
    public void setShowLogo(String showLogo) { 
		 this.showLogo = showLogo; } 
    String showLogo;
    @JsonProperty("onDemandDesktopColor") 
    public String getOnDemandDesktopColor() { 
		 return this.onDemandDesktopColor; } 
    public void setOnDemandDesktopColor(String onDemandDesktopColor) { 
		 this.onDemandDesktopColor = onDemandDesktopColor; } 
    String onDemandDesktopColor;
    @JsonProperty("onDemandShowImage") 
    public String getOnDemandShowImage() { 
		 return this.onDemandShowImage; } 
    public void setOnDemandShowImage(String onDemandShowImage) { 
		 this.onDemandShowImage = onDemandShowImage; } 
    String onDemandShowImage;
    @JsonProperty("onDemandMobileColor") 
    public String getOnDemandMobileColor() { 
		 return this.onDemandMobileColor; } 
    public void setOnDemandMobileColor(String onDemandMobileColor) { 
		 this.onDemandMobileColor = onDemandMobileColor; } 
    String onDemandMobileColor;
    @JsonProperty("inUse") 
    public String getInUse() { 
		 return this.inUse; } 
    public void setInUse(String inUse) { 
		 this.inUse = inUse; } 
    String inUse;
    @JsonProperty("onDemandDisplayText") 
    public String getOnDemandDisplayText() { 
		 return this.onDemandDisplayText; } 
    public void setOnDemandDisplayText(String onDemandDisplayText) { 
		 this.onDemandDisplayText = onDemandDisplayText; } 
    String onDemandDisplayText;
}
