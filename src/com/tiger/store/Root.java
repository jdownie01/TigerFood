package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List; 
@JsonRootName(value = "id")
public class Root{
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("conceptOptions") 
    public ConceptOptions getConceptOptions() { 
		 return this.conceptOptions; } 
    public void setConceptOptions(ConceptOptions conceptOptions) { 
		 this.conceptOptions = conceptOptions; } 
    ConceptOptions conceptOptions;
    @JsonProperty("menus") 
    public List<Menu> getMenus() { 
		 return this.menus; } 
    public void setMenus(List<Menu> menus) { 
		 this.menus = menus; } 
    List<Menu> menus;
    @JsonProperty("schedule") 
    public List<Schedule> getSchedule() { 
		 return this.schedule; } 
    public void setSchedule(List<Schedule> schedule) { 
		 this.schedule = schedule; } 
    List<Schedule> schedule;
    @JsonProperty("availableNow") 
    public boolean getAvailableNow() { 
		 return this.availableNow; } 
    public void setAvailableNow(boolean availableNow) { 
		 this.availableNow = availableNow; } 
    boolean availableNow;
    @JsonProperty("availableAt") 
    public AvailableAt getAvailableAt() { 
		 return this.availableAt; } 
    public void setAvailableAt(AvailableAt availableAt) { 
		 this.availableAt = availableAt; } 
    AvailableAt availableAt;
}
