package com.tiger.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConceptOptions {
    String profitCenterId;
    String displayText;
    String showLogo;
    String onDemandDesktopColor;
    String onDemandShowImage;
    String onDemandMobileColor;
    String inUse;
    String onDemandDisplayText;

    @JsonProperty("profitCenterId")
    public String getProfitCenterId() {
        return this.profitCenterId;
    }

    public void setProfitCenterId(String profitCenterId) {
        this.profitCenterId = profitCenterId;
    }

    @JsonProperty("displayText")
    public String getDisplayText() {
        return this.displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    @JsonProperty("showLogo")
    public String getShowLogo() {
        return this.showLogo;
    }

    public void setShowLogo(String showLogo) {
        this.showLogo = showLogo;
    }

    @JsonProperty("onDemandDesktopColor")
    public String getOnDemandDesktopColor() {
        return this.onDemandDesktopColor;
    }

    public void setOnDemandDesktopColor(String onDemandDesktopColor) {
        this.onDemandDesktopColor = onDemandDesktopColor;
    }

    @JsonProperty("onDemandShowImage")
    public String getOnDemandShowImage() {
        return this.onDemandShowImage;
    }

    public void setOnDemandShowImage(String onDemandShowImage) {
        this.onDemandShowImage = onDemandShowImage;
    }

    @JsonProperty("onDemandMobileColor")
    public String getOnDemandMobileColor() {
        return this.onDemandMobileColor;
    }

    public void setOnDemandMobileColor(String onDemandMobileColor) {
        this.onDemandMobileColor = onDemandMobileColor;
    }

    @JsonProperty("inUse")
    public String getInUse() {
        return this.inUse;
    }

    public void setInUse(String inUse) {
        this.inUse = inUse;
    }

    @JsonProperty("onDemandDisplayText")
    public String getOnDemandDisplayText() {
        return this.onDemandDisplayText;
    }

    public void setOnDemandDisplayText(String onDemandDisplayText) {
        this.onDemandDisplayText = onDemandDisplayText;
    }
}
