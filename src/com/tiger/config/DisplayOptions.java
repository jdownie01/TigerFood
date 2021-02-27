package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class DisplayOptions{
    @JsonProperty("allowCartEdit") 
    public String getAllowCartEdit() { 
		 return this.allowCartEdit; } 
    public void setAllowCartEdit(String allowCartEdit) { 
		 this.allowCartEdit = allowCartEdit; } 
    String allowCartEdit;
    @JsonProperty("check-type") 
    public String getCheckType() { 
		 return this.checkType; } 
    public void setCheckType(String checkType) { 
		 this.checkType = checkType; } 
    String checkType;
    @JsonProperty("discountStateTitle") 
    public String getDiscountStateTitle() { 
		 return this.discountStateTitle; } 
    public void setDiscountStateTitle(String discountStateTitle) { 
		 this.discountStateTitle = discountStateTitle; } 
    String discountStateTitle;
    @JsonProperty("LOYALTY/uiNoTendersAvailableMsg") 
    public String getLOYALTYUiNoTendersAvailableMsg() { 
		 return this.lOYALTYUiNoTendersAvailableMsg; } 
    public void setLOYALTYUiNoTendersAvailableMsg(String lOYALTYUiNoTendersAvailableMsg) { 
		 this.lOYALTYUiNoTendersAvailableMsg = lOYALTYUiNoTendersAvailableMsg; } 
    String lOYALTYUiNoTendersAvailableMsg;
    @JsonProperty("isSmsEnabled") 
    public String getIsSmsEnabled() { 
		 return this.isSmsEnabled; } 
    public void setIsSmsEnabled(String isSmsEnabled) { 
		 this.isSmsEnabled = isSmsEnabled; } 
    String isSmsEnabled;
    @JsonProperty("name-capture/lastInitialOnly") 
    public String getNameCaptureLastInitialOnly() { 
		 return this.nameCaptureLastInitialOnly; } 
    public void setNameCaptureLastInitialOnly(String nameCaptureLastInitialOnly) { 
		 this.nameCaptureLastInitialOnly = nameCaptureLastInitialOnly; } 
    String nameCaptureLastInitialOnly;
    @JsonProperty("currency/currencyCultureName") 
    public String getCurrencyCurrencyCultureName() { 
		 return this.currencyCurrencyCultureName; } 
    public void setCurrencyCurrencyCultureName(String currencyCurrencyCultureName) { 
		 this.currencyCurrencyCultureName = currencyCurrencyCultureName; } 
    String currencyCurrencyCultureName;
    @JsonProperty("isMobileNumberRequired") 
    public String getIsMobileNumberRequired() { 
		 return this.isMobileNumberRequired; } 
    public void setIsMobileNumberRequired(String isMobileNumberRequired) { 
		 this.isMobileNumberRequired = isMobileNumberRequired; } 
    String isMobileNumberRequired;
    @JsonProperty("hideSKULookup") 
    public String getHideSKULookup() { 
		 return this.hideSKULookup; } 
    public void setHideSKULookup(String hideSKULookup) { 
		 this.hideSKULookup = hideSKULookup; } 
    String hideSKULookup;
    @JsonProperty("isConceptLevelIgposConfigEnabled") 
    public String getIsConceptLevelIgposConfigEnabled() { 
		 return this.isConceptLevelIgposConfigEnabled; } 
    public void setIsConceptLevelIgposConfigEnabled(String isConceptLevelIgposConfigEnabled) { 
		 this.isConceptLevelIgposConfigEnabled = isConceptLevelIgposConfigEnabled; } 
    String isConceptLevelIgposConfigEnabled;
    @JsonProperty("isProfileValid") 
    public String getIsProfileValid() { 
		 return this.isProfileValid; } 
    public void setIsProfileValid(String isProfileValid) { 
		 this.isProfileValid = isProfileValid; } 
    String isProfileValid;
    @JsonProperty("voidReasonId") 
    public String getVoidReasonId() { 
		 return this.voidReasonId; } 
    public void setVoidReasonId(String voidReasonId) { 
		 this.voidReasonId = voidReasonId; } 
    String voidReasonId;
    @JsonProperty("currency/currencyCode") 
    public String getCurrencyCurrencyCode() { 
		 return this.currencyCurrencyCode; } 
    public void setCurrencyCurrencyCode(String currencyCurrencyCode) { 
		 this.currencyCurrencyCode = currencyCurrencyCode; } 
    String currencyCurrencyCode;
    @JsonProperty("onDemandIgVerificationCodeId") 
    public String getOnDemandIgVerificationCodeId() { 
		 return this.onDemandIgVerificationCodeId; } 
    public void setOnDemandIgVerificationCodeId(String onDemandIgVerificationCodeId) { 
		 this.onDemandIgVerificationCodeId = onDemandIgVerificationCodeId; } 
    String onDemandIgVerificationCodeId;
    @JsonProperty("useIgOrderApi") 
    public String getUseIgOrderApi() { 
		 return this.useIgOrderApi; } 
    public void setUseIgOrderApi(String useIgOrderApi) { 
		 this.useIgOrderApi = useIgOrderApi; } 
    String useIgOrderApi;
    @JsonProperty("roomCharge/paymentIds") 
    public String getRoomChargePaymentIds() { 
		 return this.roomChargePaymentIds; } 
    public void setRoomChargePaymentIds(String roomChargePaymentIds) { 
		 this.roomChargePaymentIds = roomChargePaymentIds; } 
    String roomChargePaymentIds;
    @JsonProperty("isTimeZoneValidationEnabled") 
    public String getIsTimeZoneValidationEnabled() { 
		 return this.isTimeZoneValidationEnabled; } 
    public void setIsTimeZoneValidationEnabled(String isTimeZoneValidationEnabled) { 
		 this.isTimeZoneValidationEnabled = isTimeZoneValidationEnabled; } 
    String isTimeZoneValidationEnabled;
    @JsonProperty("LOYALTY/bannedPlayerMessage") 
    public String getLOYALTYBannedPlayerMessage() { 
		 return this.lOYALTYBannedPlayerMessage; } 
    public void setLOYALTYBannedPlayerMessage(String lOYALTYBannedPlayerMessage) { 
		 this.lOYALTYBannedPlayerMessage = lOYALTYBannedPlayerMessage; } 
    String lOYALTYBannedPlayerMessage;
    @JsonProperty("LOYALTY/pinNumberLength") 
    public String getLOYALTYPinNumberLength() { 
		 return this.lOYALTYPinNumberLength; } 
    public void setLOYALTYPinNumberLength(String lOYALTYPinNumberLength) { 
		 this.lOYALTYPinNumberLength = lOYALTYPinNumberLength; } 
    String lOYALTYPinNumberLength;
    @JsonProperty("currency/currencySymbol") 
    public String getCurrencyCurrencySymbol() { 
		 return this.currencyCurrencySymbol; } 
    public void setCurrencyCurrencySymbol(String currencyCurrencySymbol) { 
		 this.currencyCurrencySymbol = currencyCurrencySymbol; } 
    String currencyCurrencySymbol;
    @JsonProperty("gaPaymentName") 
    public String getGaPaymentName() { 
		 return this.gaPaymentName; } 
    public void setGaPaymentName(String gaPaymentName) { 
		 this.gaPaymentName = gaPaymentName; } 
    String gaPaymentName;
    @JsonProperty("onDemandTenderId") 
    public String getOnDemandTenderId() { 
		 return this.onDemandTenderId; } 
    public void setOnDemandTenderId(String onDemandTenderId) { 
		 this.onDemandTenderId = onDemandTenderId; } 
    String onDemandTenderId;
    @JsonProperty("itemScanningDisabled") 
    public String getItemScanningDisabled() { 
		 return this.itemScanningDisabled; } 
    public void setItemScanningDisabled(String itemScanningDisabled) { 
		 this.itemScanningDisabled = itemScanningDisabled; } 
    String itemScanningDisabled;
    @JsonProperty("name-capture/isOptional") 
    public String getNameCaptureIsOptional() { 
		 return this.nameCaptureIsOptional; } 
    public void setNameCaptureIsOptional(String nameCaptureIsOptional) { 
		 this.nameCaptureIsOptional = nameCaptureIsOptional; } 
    String nameCaptureIsOptional;
    @JsonProperty("onDemandEmployeeId") 
    public String getOnDemandEmployeeId() { 
		 return this.onDemandEmployeeId; } 
    public void setOnDemandEmployeeId(String onDemandEmployeeId) { 
		 this.onDemandEmployeeId = onDemandEmployeeId; } 
    String onDemandEmployeeId;
    @JsonProperty("profit-center-id") 
    public String getProfitCenterId() { 
		 return this.profitCenterId; } 
    public void setProfitCenterId(String profitCenterId) { 
		 this.profitCenterId = profitCenterId; } 
    String profitCenterId;
    @JsonProperty("LOYALTY/uiSystemBrandingLabel") 
    public String getLOYALTYUiSystemBrandingLabel() { 
		 return this.lOYALTYUiSystemBrandingLabel; } 
    public void setLOYALTYUiSystemBrandingLabel(String lOYALTYUiSystemBrandingLabel) { 
		 this.lOYALTYUiSystemBrandingLabel = lOYALTYUiSystemBrandingLabel; } 
    String lOYALTYUiSystemBrandingLabel;
    @JsonProperty("name-capture/nameCaptureInstruction") 
    public String getNameCaptureNameCaptureInstruction() { 
		 return this.nameCaptureNameCaptureInstruction; } 
    public void setNameCaptureNameCaptureInstruction(String nameCaptureNameCaptureInstruction) { 
		 this.nameCaptureNameCaptureInstruction = nameCaptureNameCaptureInstruction; } 
    String nameCaptureNameCaptureInstruction;
    @JsonProperty("currency/currencyDecimalDigits") 
    public String getCurrencyCurrencyDecimalDigits() { 
		 return this.currencyCurrencyDecimalDigits; } 
    public void setCurrencyCurrencyDecimalDigits(String currencyCurrencyDecimalDigits) { 
		 this.currencyCurrencyDecimalDigits = currencyCurrencyDecimalDigits; } 
    String currencyCurrencyDecimalDigits;
    @JsonProperty("LOYALTY/restrictBannedPlayers") 
    public String getLOYALTYRestrictBannedPlayers() { 
		 return this.lOYALTYRestrictBannedPlayers; } 
    public void setLOYALTYRestrictBannedPlayers(String lOYALTYRestrictBannedPlayers) { 
		 this.lOYALTYRestrictBannedPlayers = lOYALTYRestrictBannedPlayers; } 
    String lOYALTYRestrictBannedPlayers;
    @JsonProperty("onDemandTerminalId") 
    public String getOnDemandTerminalId() { 
		 return this.onDemandTerminalId; } 
    public void setOnDemandTerminalId(String onDemandTerminalId) { 
		 this.onDemandTerminalId = onDemandTerminalId; } 
    String onDemandTerminalId;
}
