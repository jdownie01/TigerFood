package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class _3494 {
    String id;
    String confirmationText;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("confirmationText")
    public String getConfirmationText() {
        return this.confirmationText;
    }

    public void setConfirmationText(String confirmationText) {
        this.confirmationText = confirmationText;
    }
}
