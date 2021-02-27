package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class LimitItemsByClassification{
    @JsonProperty("featureEnabled") 
    public boolean getFeatureEnabled() { 
		 return this.featureEnabled; } 
    public void setFeatureEnabled(boolean featureEnabled) { 
		 this.featureEnabled = featureEnabled; } 
    boolean featureEnabled;
    @JsonProperty("classificationDetails") 
    public List<ClassificationDetail> getClassificationDetails() { 
		 return this.classificationDetails; } 
    public void setClassificationDetails(List<ClassificationDetail> classificationDetails) { 
		 this.classificationDetails = classificationDetails; } 
    List<ClassificationDetail> classificationDetails;
}
