package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Root{
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("image") 
    public String getImage() { 
		 return this.image; } 
    public void setImage(String image) { 
		 this.image = image; } 
    String image;
    @JsonProperty("displayProfileId") 
    public String getDisplayProfileId() { 
		 return this.displayProfileId; } 
    public void setDisplayProfileId(String displayProfileId) { 
		 this.displayProfileId = displayProfileId; } 
    String displayProfileId;
    @JsonProperty("displayOptions") 
    public DisplayOptions getDisplayOptions() { 
		 return this.displayOptions; } 
    public void setDisplayOptions(DisplayOptions displayOptions) { 
		 this.displayOptions = displayOptions; } 
    DisplayOptions displayOptions;
    @JsonProperty("address") 
    public List<String> getAddress() { 
		 return this.address; } 
    public void setAddress(List<String> address) { 
		 this.address = address; } 
    List<String> address;
    @JsonProperty("timeZone") 
    public String getTimeZone() { 
		 return this.timeZone; } 
    public void setTimeZone(String timeZone) { 
		 this.timeZone = timeZone; } 
    String timeZone;
    @JsonProperty("availableAt") 
    public AvailableAt getAvailableAt() { 
		 return this.availableAt; } 
    public void setAvailableAt(AvailableAt availableAt) { 
		 this.availableAt = availableAt; } 
    AvailableAt availableAt;
    @JsonProperty("allAvailableList") 
    public List<AllAvailableList> getAllAvailableList() { 
		 return this.allAvailableList; } 
    public void setAllAvailableList(List<AllAvailableList> allAvailableList) { 
		 this.allAvailableList = allAvailableList; } 
    List<AllAvailableList> allAvailableList;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("profitCenterId") 
    public String getProfitCenterId() { 
		 return this.profitCenterId; } 
    public void setProfitCenterId(String profitCenterId) { 
		 this.profitCenterId = profitCenterId; } 
    String profitCenterId;
    @JsonProperty("pay") 
    public Pay getPay() { 
		 return this.pay; } 
    public void setPay(Pay pay) { 
		 this.pay = pay; } 
    Pay pay;
    @JsonProperty("multiPaymentEnabled") 
    public boolean getMultiPaymentEnabled() { 
		 return this.multiPaymentEnabled; } 
    public void setMultiPaymentEnabled(boolean multiPaymentEnabled) { 
		 this.multiPaymentEnabled = multiPaymentEnabled; } 
    boolean multiPaymentEnabled;
    @JsonProperty("digitalMenuEnabled") 
    public boolean getDigitalMenuEnabled() { 
		 return this.digitalMenuEnabled; } 
    public void setDigitalMenuEnabled(boolean digitalMenuEnabled) { 
		 this.digitalMenuEnabled = digitalMenuEnabled; } 
    boolean digitalMenuEnabled;
    @JsonProperty("multiPassEnabled") 
    public boolean getMultiPassEnabled() { 
		 return this.multiPassEnabled; } 
    public void setMultiPassEnabled(boolean multiPassEnabled) { 
		 this.multiPassEnabled = multiPassEnabled; } 
    boolean multiPassEnabled;
    @JsonProperty("cateringEnabled") 
    public boolean getCateringEnabled() { 
		 return this.cateringEnabled; } 
    public void setCateringEnabled(boolean cateringEnabled) { 
		 this.cateringEnabled = cateringEnabled; } 
    boolean cateringEnabled;
    @JsonProperty("etf") 
    public Etf getEtf() { 
		 return this.etf; } 
    public void setEtf(Etf etf) { 
		 this.etf = etf; } 
    Etf etf;
    @JsonProperty("nameCapture") 
    public NameCapture getNameCapture() { 
		 return this.nameCapture; } 
    public void setNameCapture(NameCapture nameCapture) { 
		 this.nameCapture = nameCapture; } 
    NameCapture nameCapture;
    @JsonProperty("aliasNameCaptureEnabled") 
    public boolean getAliasNameCaptureEnabled() { 
		 return this.aliasNameCaptureEnabled; } 
    public void setAliasNameCaptureEnabled(boolean aliasNameCaptureEnabled) { 
		 this.aliasNameCaptureEnabled = aliasNameCaptureEnabled; } 
    boolean aliasNameCaptureEnabled;
    @JsonProperty("useIgOrderApi") 
    public boolean getUseIgOrderApi() { 
		 return this.useIgOrderApi; } 
    public void setUseIgOrderApi(boolean useIgOrderApi) { 
		 this.useIgOrderApi = useIgOrderApi; } 
    boolean useIgOrderApi;
    @JsonProperty("conceptLevelIgPosConfig") 
    public boolean getConceptLevelIgPosConfig() { 
		 return this.conceptLevelIgPosConfig; } 
    public void setConceptLevelIgPosConfig(boolean conceptLevelIgPosConfig) { 
		 this.conceptLevelIgPosConfig = conceptLevelIgPosConfig; } 
    boolean conceptLevelIgPosConfig;
    @JsonProperty("sms") 
    public Sms getSms() { 
		 return this.sms; } 
    public void setSms(Sms sms) { 
		 this.sms = sms; } 
    Sms sms;
    @JsonProperty("todaySchedulingEnabled") 
    public boolean getTodaySchedulingEnabled() { 
		 return this.todaySchedulingEnabled; } 
    public void setTodaySchedulingEnabled(boolean todaySchedulingEnabled) { 
		 this.todaySchedulingEnabled = todaySchedulingEnabled; } 
    boolean todaySchedulingEnabled;
    @JsonProperty("calendarScheduling") 
    public CalendarScheduling getCalendarScheduling() { 
		 return this.calendarScheduling; } 
    public void setCalendarScheduling(CalendarScheduling calendarScheduling) { 
		 this.calendarScheduling = calendarScheduling; } 
    CalendarScheduling calendarScheduling;
    @JsonProperty("isCalendarSchedulingEnabled") 
    public boolean getIsCalendarSchedulingEnabled() { 
		 return this.isCalendarSchedulingEnabled; } 
    public void setIsCalendarSchedulingEnabled(boolean isCalendarSchedulingEnabled) { 
		 this.isCalendarSchedulingEnabled = isCalendarSchedulingEnabled; } 
    boolean isCalendarSchedulingEnabled;
    @JsonProperty("isAsapOrderDisabled") 
    public boolean getIsAsapOrderDisabled() { 
		 return this.isAsapOrderDisabled; } 
    public void setIsAsapOrderDisabled(boolean isAsapOrderDisabled) { 
		 this.isAsapOrderDisabled = isAsapOrderDisabled; } 
    boolean isAsapOrderDisabled;
    @JsonProperty("isFutureSchedulingEnabled") 
    public boolean getIsFutureSchedulingEnabled() { 
		 return this.isFutureSchedulingEnabled; } 
    public void setIsFutureSchedulingEnabled(boolean isFutureSchedulingEnabled) { 
		 this.isFutureSchedulingEnabled = isFutureSchedulingEnabled; } 
    boolean isFutureSchedulingEnabled;
    @JsonProperty("futureScheduledDays") 
    public int getFutureScheduledDays() { 
		 return this.futureScheduledDays; } 
    public void setFutureScheduledDays(int futureScheduledDays) { 
		 this.futureScheduledDays = futureScheduledDays; } 
    int futureScheduledDays;
    @JsonProperty("isScheduleOrderEnabled") 
    public boolean getIsScheduleOrderEnabled() { 
		 return this.isScheduleOrderEnabled; } 
    public void setIsScheduleOrderEnabled(boolean isScheduleOrderEnabled) { 
		 this.isScheduleOrderEnabled = isScheduleOrderEnabled; } 
    boolean isScheduleOrderEnabled;
    @JsonProperty("isLoyaltyEnabled") 
    public boolean getIsLoyaltyEnabled() { 
		 return this.isLoyaltyEnabled; } 
    public void setIsLoyaltyEnabled(boolean isLoyaltyEnabled) { 
		 this.isLoyaltyEnabled = isLoyaltyEnabled; } 
    boolean isLoyaltyEnabled;
    @JsonProperty("paymentLoyaltyEnabled") 
    public boolean getPaymentLoyaltyEnabled() { 
		 return this.paymentLoyaltyEnabled; } 
    public void setPaymentLoyaltyEnabled(boolean paymentLoyaltyEnabled) { 
		 this.paymentLoyaltyEnabled = paymentLoyaltyEnabled; } 
    boolean paymentLoyaltyEnabled;
    @JsonProperty("loyaltyAccrueEnabled") 
    public boolean getLoyaltyAccrueEnabled() { 
		 return this.loyaltyAccrueEnabled; } 
    public void setLoyaltyAccrueEnabled(boolean loyaltyAccrueEnabled) { 
		 this.loyaltyAccrueEnabled = loyaltyAccrueEnabled; } 
    boolean loyaltyAccrueEnabled;
    @JsonProperty("loyaltyDetails") 
    public LoyaltyDetails getLoyaltyDetails() { 
		 return this.loyaltyDetails; } 
    public void setLoyaltyDetails(LoyaltyDetails loyaltyDetails) { 
		 this.loyaltyDetails = loyaltyDetails; } 
    LoyaltyDetails loyaltyDetails;
    @JsonProperty("dateTime") 
    public String getDateTime() { 
		 return this.dateTime; } 
    public void setDateTime(String dateTime) { 
		 this.dateTime = dateTime; } 
    String dateTime;
    @JsonProperty("emailReceipt") 
    public EmailReceipt getEmailReceipt() { 
		 return this.emailReceipt; } 
    public void setEmailReceipt(EmailReceipt emailReceipt) { 
		 this.emailReceipt = emailReceipt; } 
    EmailReceipt emailReceipt;
    @JsonProperty("textReceipt") 
    public TextReceipt getTextReceipt() { 
		 return this.textReceipt; } 
    public void setTextReceipt(TextReceipt textReceipt) { 
		 this.textReceipt = textReceipt; } 
    TextReceipt textReceipt;
    @JsonProperty("textReceiptFormat") 
    public TextReceiptFormat getTextReceiptFormat() { 
		 return this.textReceiptFormat; } 
    public void setTextReceiptFormat(TextReceiptFormat textReceiptFormat) { 
		 this.textReceiptFormat = textReceiptFormat; } 
    TextReceiptFormat textReceiptFormat;
    @JsonProperty("navigation") 
    public Navigation getNavigation() { 
		 return this.navigation; } 
    public void setNavigation(Navigation navigation) { 
		 this.navigation = navigation; } 
    Navigation navigation;
    @JsonProperty("skipConceptsPage") 
    public boolean getSkipConceptsPage() { 
		 return this.skipConceptsPage; } 
    public void setSkipConceptsPage(boolean skipConceptsPage) { 
		 this.skipConceptsPage = skipConceptsPage; } 
    boolean skipConceptsPage;
    @JsonProperty("dineInConfig") 
    public DineInConfig getDineInConfig() { 
		 return this.dineInConfig; } 
    public void setDineInConfig(DineInConfig dineInConfig) { 
		 this.dineInConfig = dineInConfig; } 
    DineInConfig dineInConfig;
    @JsonProperty("pickUpConfig") 
    public PickUpConfig getPickUpConfig() { 
		 return this.pickUpConfig; } 
    public void setPickUpConfig(PickUpConfig pickUpConfig) { 
		 this.pickUpConfig = pickUpConfig; } 
    PickUpConfig pickUpConfig;
    @JsonProperty("profitCenter") 
    public ProfitCenter getProfitCenter() { 
		 return this.profitCenter; } 
    public void setProfitCenter(ProfitCenter profitCenter) { 
		 this.profitCenter = profitCenter; } 
    ProfitCenter profitCenter;
    @JsonProperty("checkTypeId") 
    public String getCheckTypeId() { 
		 return this.checkTypeId; } 
    public void setCheckTypeId(String checkTypeId) { 
		 this.checkTypeId = checkTypeId; } 
    String checkTypeId;
    @JsonProperty("roomChargeIds") 
    public String getRoomChargeIds() { 
		 return this.roomChargeIds; } 
    public void setRoomChargeIds(String roomChargeIds) { 
		 this.roomChargeIds = roomChargeIds; } 
    String roomChargeIds;
    @JsonProperty("storePriceLevel") 
    public String getStorePriceLevel() { 
		 return this.storePriceLevel; } 
    public void setStorePriceLevel(String storePriceLevel) { 
		 this.storePriceLevel = storePriceLevel; } 
    String storePriceLevel;
    @JsonProperty("specialInstructions") 
    public SpecialInstructions getSpecialInstructions() { 
		 return this.specialInstructions; } 
    public void setSpecialInstructions(SpecialInstructions specialInstructions) { 
		 this.specialInstructions = specialInstructions; } 
    SpecialInstructions specialInstructions;
    @JsonProperty("atriumConfig") 
    public AtriumConfig getAtriumConfig() { 
		 return this.atriumConfig; } 
    public void setAtriumConfig(AtriumConfig atriumConfig) { 
		 this.atriumConfig = atriumConfig; } 
    AtriumConfig atriumConfig;
    @JsonProperty("cartScreen") 
    public CartScreen getCartScreen() { 
		 return this.cartScreen; } 
    public void setCartScreen(CartScreen cartScreen) { 
		 this.cartScreen = cartScreen; } 
    CartScreen cartScreen;
    @JsonProperty("limitItemsByClassification") 
    public LimitItemsByClassification getLimitItemsByClassification() { 
		 return this.limitItemsByClassification; } 
    public void setLimitItemsByClassification(LimitItemsByClassification limitItemsByClassification) { 
		 this.limitItemsByClassification = limitItemsByClassification; } 
    LimitItemsByClassification limitItemsByClassification;
    @JsonProperty("hideAllPrices") 
    public boolean getHideAllPrices() { 
		 return this.hideAllPrices; } 
    public void setHideAllPrices(boolean hideAllPrices) { 
		 this.hideAllPrices = hideAllPrices; } 
    boolean hideAllPrices;
    @JsonProperty("zeroCheckout") 
    public boolean getZeroCheckout() { 
		 return this.zeroCheckout; } 
    public void setZeroCheckout(boolean zeroCheckout) { 
		 this.zeroCheckout = zeroCheckout; } 
    boolean zeroCheckout;
    @JsonProperty("showSummaryItemList") 
    public boolean getShowSummaryItemList() { 
		 return this.showSummaryItemList; } 
    public void setShowSummaryItemList(boolean showSummaryItemList) { 
		 this.showSummaryItemList = showSummaryItemList; } 
    boolean showSummaryItemList;
    @JsonProperty("discountEnabled") 
    public boolean getDiscountEnabled() { 
		 return this.discountEnabled; } 
    public void setDiscountEnabled(boolean discountEnabled) { 
		 this.discountEnabled = discountEnabled; } 
    boolean discountEnabled;
    @JsonProperty("discountConfig") 
    public boolean getDiscountConfig() { 
		 return this.discountConfig; } 
    public void setDiscountConfig(boolean discountConfig) { 
		 this.discountConfig = discountConfig; } 
    boolean discountConfig;
    @JsonProperty("kitchenSettings") 
    public KitchenSettings getKitchenSettings() { 
		 return this.kitchenSettings; } 
    public void setKitchenSettings(KitchenSettings kitchenSettings) { 
		 this.kitchenSettings = kitchenSettings; } 
    KitchenSettings kitchenSettings;
    @JsonProperty("tenderRestriction") 
    public TenderRestriction getTenderRestriction() { 
		 return this.tenderRestriction; } 
    public void setTenderRestriction(TenderRestriction tenderRestriction) { 
		 this.tenderRestriction = tenderRestriction; } 
    TenderRestriction tenderRestriction;
    @JsonProperty("rtpProfileConfig") 
    public RtpProfileConfig getRtpProfileConfig() { 
		 return this.rtpProfileConfig; } 
    public void setRtpProfileConfig(RtpProfileConfig rtpProfileConfig) { 
		 this.rtpProfileConfig = rtpProfileConfig; } 
    RtpProfileConfig rtpProfileConfig;
    @JsonProperty("rtpConfiguration") 
    public RtpConfiguration getRtpConfiguration() { 
		 return this.rtpConfiguration; } 
    public void setRtpConfiguration(RtpConfiguration rtpConfiguration) { 
		 this.rtpConfiguration = rtpConfiguration; } 
    RtpConfiguration rtpConfiguration;
    @JsonProperty("contentLocalization") 
    public ContentLocalization getContentLocalization() { 
		 return this.contentLocalization; } 
    public void setContentLocalization(ContentLocalization contentLocalization) { 
		 this.contentLocalization = contentLocalization; } 
    ContentLocalization contentLocalization;
    @JsonProperty("disneyConfig") 
    public DisneyConfig getDisneyConfig() { 
		 return this.disneyConfig; } 
    public void setDisneyConfig(DisneyConfig disneyConfig) { 
		 this.disneyConfig = disneyConfig; } 
    DisneyConfig disneyConfig;
    @JsonProperty("showIdentificationPage") 
    public boolean getShowIdentificationPage() { 
		 return this.showIdentificationPage; } 
    public void setShowIdentificationPage(boolean showIdentificationPage) { 
		 this.showIdentificationPage = showIdentificationPage; } 
    boolean showIdentificationPage;
    @JsonProperty("gaDiscounts") 
    public GaDiscounts getGaDiscounts() { 
		 return this.gaDiscounts; } 
    public void setGaDiscounts(GaDiscounts gaDiscounts) { 
		 this.gaDiscounts = gaDiscounts; } 
    GaDiscounts gaDiscounts;
    @JsonProperty("storeAvailabeNow") 
    public boolean getStoreAvailabeNow() { 
		 return this.storeAvailabeNow; } 
    public void setStoreAvailabeNow(boolean storeAvailabeNow) { 
		 this.storeAvailabeNow = storeAvailabeNow; } 
    boolean storeAvailabeNow;
    @JsonProperty("taxIdentificationNumber") 
    public String getTaxIdentificationNumber() { 
		 return this.taxIdentificationNumber; } 
    public void setTaxIdentificationNumber(String taxIdentificationNumber) { 
		 this.taxIdentificationNumber = taxIdentificationNumber; } 
    String taxIdentificationNumber;
    @JsonProperty("storeInfo") 
    public StoreInfo getStoreInfo() { 
		 return this.storeInfo; } 
    public void setStoreInfo(StoreInfo storeInfo) { 
		 this.storeInfo = storeInfo; } 
    StoreInfo storeInfo;
    @JsonProperty("modifiers") 
    public Modifiers getModifiers() { 
		 return this.modifiers; } 
    public void setModifiers(Modifiers modifiers) { 
		 this.modifiers = modifiers; } 
    Modifiers modifiers;
}
