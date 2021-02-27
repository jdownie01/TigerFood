package com.tiger.item;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemImage {
    String businessContextId;
    String imageId;
    String name;
    List<String> fileNames;
    List<String> tags;

    @JsonProperty("businessContextId")
    public String getBusinessContextId() {
        return this.businessContextId;
    }

    public void setBusinessContextId(String businessContextId) {
        this.businessContextId = businessContextId;
    }

    @JsonProperty("imageId")
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("fileNames")
    public List<String> getFileNames() {
        return this.fileNames;
    }

    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
