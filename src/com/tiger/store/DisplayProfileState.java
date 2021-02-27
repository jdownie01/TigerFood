package com.tiger.store;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DisplayProfileState {
    String displayProfileId;
    List<ConceptState> conceptStates;

    @JsonProperty("displayProfileId")
    public String getDisplayProfileId() {
        return this.displayProfileId;
    }

    public void setDisplayProfileId(String displayProfileId) {
        this.displayProfileId = displayProfileId;
    }

    @JsonProperty("conceptStates")
    public List<ConceptState> getConceptStates() {
        return this.conceptStates;
    }

    public void setConceptStates(List<ConceptState> conceptStates) {
        this.conceptStates = conceptStates;
    }
}
