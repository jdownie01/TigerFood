package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Navigation{
    @JsonProperty("skipConceptPageIfPossible") 
    public boolean getSkipConceptPageIfPossible() { 
		 return this.skipConceptPageIfPossible; } 
    public void setSkipConceptPageIfPossible(boolean skipConceptPageIfPossible) { 
		 this.skipConceptPageIfPossible = skipConceptPageIfPossible; } 
    boolean skipConceptPageIfPossible;
}
