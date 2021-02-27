package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class ProfitCenter{
    @JsonProperty("useProfitCenterByConcept") 
    public boolean getUseProfitCenterByConcept() { 
		 return this.useProfitCenterByConcept; } 
    public void setUseProfitCenterByConcept(boolean useProfitCenterByConcept) { 
		 this.useProfitCenterByConcept = useProfitCenterByConcept; } 
    boolean useProfitCenterByConcept;
}
