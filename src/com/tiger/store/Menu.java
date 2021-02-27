package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Menu{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("categories") 
    public List<Category> getCategories() { 
		 return this.categories; } 
    public void setCategories(List<Category> categories) { 
		 this.categories = categories; } 
    List<Category> categories;
    @JsonProperty("lastUpdateTime") 
    public Date getLastUpdateTime() { 
		 return this.lastUpdateTime; } 
    public void setLastUpdateTime(Date lastUpdateTime) { 
		 this.lastUpdateTime = lastUpdateTime; } 
    Date lastUpdateTime;
}
