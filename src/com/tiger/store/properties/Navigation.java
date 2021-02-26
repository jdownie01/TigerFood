package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Navigation {
    boolean skipConceptPageIfPossible;

    @JsonProperty("skipConceptPageIfPossible")
    public boolean getSkipConceptPageIfPossible() {
        return this.skipConceptPageIfPossible;
    }

    public void setSkipConceptPageIfPossible(boolean skipConceptPageIfPossible) {
        this.skipConceptPageIfPossible = skipConceptPageIfPossible;
    }
}
