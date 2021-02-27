package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardReaderScreenConfig {
    String topInstructionText;

    @JsonProperty("topInstructionText")
    public String getTopInstructionText() {
        return this.topInstructionText;
    }

    public void setTopInstructionText(String topInstructionText) {
        this.topInstructionText = topInstructionText;
    }
}
