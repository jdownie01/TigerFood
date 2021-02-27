package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextReceiptFormat {
    String introText;
    boolean overrideFromStoreConfig;
    boolean isItemizedListEnabled;
    boolean isTotalsEnabled;
    boolean isIntroEnabled;

    @JsonProperty("introText")
    public String getIntroText() {
        return this.introText;
    }

    public void setIntroText(String introText) {
        this.introText = introText;
    }

    @JsonProperty("overrideFromStoreConfig")
    public boolean getOverrideFromStoreConfig() {
        return this.overrideFromStoreConfig;
    }

    public void setOverrideFromStoreConfig(boolean overrideFromStoreConfig) {
        this.overrideFromStoreConfig = overrideFromStoreConfig;
    }

    @JsonProperty("isItemizedListEnabled")
    public boolean getIsItemizedListEnabled() {
        return this.isItemizedListEnabled;
    }

    public void setIsItemizedListEnabled(boolean isItemizedListEnabled) {
        this.isItemizedListEnabled = isItemizedListEnabled;
    }

    @JsonProperty("isTotalsEnabled")
    public boolean getIsTotalsEnabled() {
        return this.isTotalsEnabled;
    }

    public void setIsTotalsEnabled(boolean isTotalsEnabled) {
        this.isTotalsEnabled = isTotalsEnabled;
    }

    @JsonProperty("isIntroEnabled")
    public boolean getIsIntroEnabled() {
        return this.isIntroEnabled;
    }

    public void setIsIntroEnabled(boolean isIntroEnabled) {
        this.isIntroEnabled = isIntroEnabled;
    }
}
