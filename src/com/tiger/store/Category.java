package com.tiger.store;
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Category{
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("categoryOptions") 
    public CategoryOptions getCategoryOptions() { 
		 return this.categoryOptions; } 
    public void setCategoryOptions(CategoryOptions categoryOptions) { 
		 this.categoryOptions = categoryOptions; } 
    CategoryOptions categoryOptions;
    @JsonProperty("items") 
    public List<String> getItems() { 
		 return this.items; } 
    public void setItems(List<String> items) { 
		 this.items = items; } 
    List<String> items;
    @JsonProperty("itemIdToItemPropertiesMap") 
    public ItemIdToItemPropertiesMap getItemIdToItemPropertiesMap() { 
		 return this.itemIdToItemPropertiesMap; } 
    public void setItemIdToItemPropertiesMap(ItemIdToItemPropertiesMap itemIdToItemPropertiesMap) { 
		 this.itemIdToItemPropertiesMap = itemIdToItemPropertiesMap; } 
    ItemIdToItemPropertiesMap itemIdToItemPropertiesMap;
    @JsonProperty("kioskImages") 
    public List<Object> getKioskImages() { 
		 return this.kioskImages; } 
    public void setKioskImages(List<Object> kioskImages) { 
		 this.kioskImages = kioskImages; } 
    List<Object> kioskImages;
}
