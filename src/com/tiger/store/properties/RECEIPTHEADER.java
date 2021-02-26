package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RECEIPTHEADER {
    String fileName;

    @JsonProperty("fileName")
    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
