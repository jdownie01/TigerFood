package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
public class ConceptState{
    @JsonProperty("conceptId") 
    public String getConceptId() { 
		 return this.conceptId; } 
    public void setConceptId(String conceptId) { 
		 this.conceptId = conceptId; } 
    String conceptId;
    @JsonProperty("menuId") 
    public String getMenuId() { 
		 return this.menuId; } 
    public void setMenuId(String menuId) { 
		 this.menuId = menuId; } 
    String menuId;
}
