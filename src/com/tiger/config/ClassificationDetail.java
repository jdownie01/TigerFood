package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class ClassificationDetail{
    @JsonProperty("classifiedBy") 
    public String getClassifiedBy() { 
		 return this.classifiedBy; } 
    public void setClassifiedBy(String classifiedBy) { 
		 this.classifiedBy = classifiedBy; } 
    String classifiedBy;
    @JsonProperty("maxItems") 
    public int getMaxItems() { 
		 return this.maxItems; } 
    public void setMaxItems(int maxItems) { 
		 this.maxItems = maxItems; } 
    int maxItems;
    @JsonProperty("alertHeaderText") 
    public String getAlertHeaderText() { 
		 return this.alertHeaderText; } 
    public void setAlertHeaderText(String alertHeaderText) { 
		 this.alertHeaderText = alertHeaderText; } 
    String alertHeaderText;
    @JsonProperty("alertInstructionText") 
    public String getAlertInstructionText() { 
		 return this.alertInstructionText; } 
    public void setAlertInstructionText(String alertInstructionText) { 
		 this.alertInstructionText = alertInstructionText; } 
    String alertInstructionText;
    @JsonProperty("revenueCategoryIds") 
    public List<Object> getRevenueCategoryIds() { 
		 return this.revenueCategoryIds; } 
    public void setRevenueCategoryIds(List<Object> revenueCategoryIds) { 
		 this.revenueCategoryIds = revenueCategoryIds; } 
    List<Object> revenueCategoryIds;
    @JsonProperty("productClassIds") 
    public List<Object> getProductClassIds() { 
		 return this.productClassIds; } 
    public void setProductClassIds(List<Object> productClassIds) { 
		 this.productClassIds = productClassIds; } 
    List<Object> productClassIds;
}
