package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class DisplayProfileState{
    @JsonProperty("displayProfileId") 
    public String getDisplayProfileId() { 
		 return this.displayProfileId; } 
    public void setDisplayProfileId(String displayProfileId) { 
		 this.displayProfileId = displayProfileId; } 
    String displayProfileId;
    @JsonProperty("conceptStates") 
    public List<ConceptState> getConceptStates() { 
		 return this.conceptStates; } 
    public void setConceptStates(List<ConceptState> conceptStates) { 
		 this.conceptStates = conceptStates; } 
    List<ConceptState> conceptStates;
}
