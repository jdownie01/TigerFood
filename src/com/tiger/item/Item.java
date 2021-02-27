package com.tiger.item;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Item {
    String id;
    String contextId;
    String tenantId;
    String itemId;
    String name;
    boolean isDeleted;
    boolean isActive;
    Date lastUpdateTime;
    String revenueCategoryId;
    String productClassId;
    String kpText;
    String kitchenDisplayText;
    String receiptText;
    Price price;
    String defaultPriceLevelId;
    PriceLevels priceLevels;
    boolean isSoldByWeight;
    int tareWeight;
    boolean isDiscountable;
    boolean allowPriceOverride;
    boolean isTaxIncluded;
    List<String> taxClasses;
    String kitchenVideoLabel;
    String kitchenVideoId;
    int kitchenVideoCategoryId;
    int kitchenCookTimeSeconds;
    List<String> skus;
    String itemType;
    List<Object> childGroups;
    String displayText;
    List<ItemImage> itemImages;
    boolean isAvailableToGuests;
    boolean isPreselectedToGuests;
    List<Object> tagNames;
    List<Object> tagIds;
    String substituteItemId;
    boolean isSubstituteItem;
    Properties properties;
    String amount;
    String image;
    String thumbnail;
    List<Object> options;
    List<Object> attributes;
    String conceptId;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("contextId")
    public String getContextId() {
        return this.contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("itemId")
    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isDeleted")
    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isActive")
    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("lastUpdateTime")
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @JsonProperty("revenueCategoryId")
    public String getRevenueCategoryId() {
        return this.revenueCategoryId;
    }

    public void setRevenueCategoryId(String revenueCategoryId) {
        this.revenueCategoryId = revenueCategoryId;
    }

    @JsonProperty("productClassId")
    public String getProductClassId() {
        return this.productClassId;
    }

    public void setProductClassId(String productClassId) {
        this.productClassId = productClassId;
    }

    @JsonProperty("kpText")
    public String getKpText() {
        return this.kpText;
    }

    public void setKpText(String kpText) {
        this.kpText = kpText;
    }

    @JsonProperty("kitchenDisplayText")
    public String getKitchenDisplayText() {
        return this.kitchenDisplayText;
    }

    public void setKitchenDisplayText(String kitchenDisplayText) {
        this.kitchenDisplayText = kitchenDisplayText;
    }

    @JsonProperty("receiptText")
    public String getReceiptText() {
        return this.receiptText;
    }

    public void setReceiptText(String receiptText) {
        this.receiptText = receiptText;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return this.price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("defaultPriceLevelId")
    public String getDefaultPriceLevelId() {
        return this.defaultPriceLevelId;
    }

    public void setDefaultPriceLevelId(String defaultPriceLevelId) {
        this.defaultPriceLevelId = defaultPriceLevelId;
    }

    @JsonProperty("priceLevels")
    public PriceLevels getPriceLevels() {
        return this.priceLevels;
    }

    public void setPriceLevels(PriceLevels priceLevels) {
        this.priceLevels = priceLevels;
    }

    @JsonProperty("isSoldByWeight")
    public boolean getIsSoldByWeight() {
        return this.isSoldByWeight;
    }

    public void setIsSoldByWeight(boolean isSoldByWeight) {
        this.isSoldByWeight = isSoldByWeight;
    }

    @JsonProperty("tareWeight")
    public int getTareWeight() {
        return this.tareWeight;
    }

    public void setTareWeight(int tareWeight) {
        this.tareWeight = tareWeight;
    }

    @JsonProperty("isDiscountable")
    public boolean getIsDiscountable() {
        return this.isDiscountable;
    }

    public void setIsDiscountable(boolean isDiscountable) {
        this.isDiscountable = isDiscountable;
    }

    @JsonProperty("allowPriceOverride")
    public boolean getAllowPriceOverride() {
        return this.allowPriceOverride;
    }

    public void setAllowPriceOverride(boolean allowPriceOverride) {
        this.allowPriceOverride = allowPriceOverride;
    }

    @JsonProperty("isTaxIncluded")
    public boolean getIsTaxIncluded() {
        return this.isTaxIncluded;
    }

    public void setIsTaxIncluded(boolean isTaxIncluded) {
        this.isTaxIncluded = isTaxIncluded;
    }

    @JsonProperty("taxClasses")
    public List<String> getTaxClasses() {
        return this.taxClasses;
    }

    public void setTaxClasses(List<String> taxClasses) {
        this.taxClasses = taxClasses;
    }

    @JsonProperty("kitchenVideoLabel")
    public String getKitchenVideoLabel() {
        return this.kitchenVideoLabel;
    }

    public void setKitchenVideoLabel(String kitchenVideoLabel) {
        this.kitchenVideoLabel = kitchenVideoLabel;
    }

    @JsonProperty("kitchenVideoId")
    public String getKitchenVideoId() {
        return this.kitchenVideoId;
    }

    public void setKitchenVideoId(String kitchenVideoId) {
        this.kitchenVideoId = kitchenVideoId;
    }

    @JsonProperty("kitchenVideoCategoryId")
    public int getKitchenVideoCategoryId() {
        return this.kitchenVideoCategoryId;
    }

    public void setKitchenVideoCategoryId(int kitchenVideoCategoryId) {
        this.kitchenVideoCategoryId = kitchenVideoCategoryId;
    }

    @JsonProperty("kitchenCookTimeSeconds")
    public int getKitchenCookTimeSeconds() {
        return this.kitchenCookTimeSeconds;
    }

    public void setKitchenCookTimeSeconds(int kitchenCookTimeSeconds) {
        this.kitchenCookTimeSeconds = kitchenCookTimeSeconds;
    }

    @JsonProperty("skus")
    public List<String> getSkus() {
        return this.skus;
    }

    public void setSkus(List<String> skus) {
        this.skus = skus;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("childGroups")
    public List<Object> getChildGroups() {
        return this.childGroups;
    }

    public void setChildGroups(List<Object> childGroups) {
        this.childGroups = childGroups;
    }

    @JsonProperty("displayText")
    public String getDisplayText() {
        return this.displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    @JsonProperty("itemImages")
    public List<ItemImage> getItemImages() {
        return this.itemImages;
    }

    public void setItemImages(List<ItemImage> itemImages) {
        this.itemImages = itemImages;
    }

    @JsonProperty("isAvailableToGuests")
    public boolean getIsAvailableToGuests() {
        return this.isAvailableToGuests;
    }

    public void setIsAvailableToGuests(boolean isAvailableToGuests) {
        this.isAvailableToGuests = isAvailableToGuests;
    }

    @JsonProperty("isPreselectedToGuests")
    public boolean getIsPreselectedToGuests() {
        return this.isPreselectedToGuests;
    }

    public void setIsPreselectedToGuests(boolean isPreselectedToGuests) {
        this.isPreselectedToGuests = isPreselectedToGuests;
    }

    @JsonProperty("tagNames")
    public List<Object> getTagNames() {
        return this.tagNames;
    }

    public void setTagNames(List<Object> tagNames) {
        this.tagNames = tagNames;
    }

    @JsonProperty("tagIds")
    public List<Object> getTagIds() {
        return this.tagIds;
    }

    public void setTagIds(List<Object> tagIds) {
        this.tagIds = tagIds;
    }

    @JsonProperty("substituteItemId")
    public String getSubstituteItemId() {
        return this.substituteItemId;
    }

    public void setSubstituteItemId(String substituteItemId) {
        this.substituteItemId = substituteItemId;
    }

    @JsonProperty("isSubstituteItem")
    public boolean getIsSubstituteItem() {
        return this.isSubstituteItem;
    }

    public void setIsSubstituteItem(boolean isSubstituteItem) {
        this.isSubstituteItem = isSubstituteItem;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return this.properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("image")
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("options")
    public List<Object> getOptions() {
        return this.options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    @JsonProperty("attributes")
    public List<Object> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("conceptId")
    public String getConceptId() {
        return this.conceptId;
    }

    public void setConceptId(String conceptId) {
        this.conceptId = conceptId;
    }
}
