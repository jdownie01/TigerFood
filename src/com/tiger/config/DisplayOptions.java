package com.tiger.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayOptions {
    String allowCartEdit;
    String checkType;
    String discountStateTitle;
    String lOYALTYUiNoTendersAvailableMsg;
    String isSmsEnabled;
    String nameCaptureLastInitialOnly;
    String currencyCurrencyCultureName;
    String isMobileNumberRequired;
    String hideSKULookup;
    String isConceptLevelIgposConfigEnabled;
    String isProfileValid;
    String voidReasonId;
    String currencyCurrencyCode;
    String onDemandIgVerificationCodeId;
    String useIgOrderApi;
    String roomChargePaymentIds;
    String isTimeZoneValidationEnabled;
    String lOYALTYBannedPlayerMessage;
    String lOYALTYPinNumberLength;
    String currencyCurrencySymbol;
    String gaPaymentName;
    String onDemandTenderId;
    String itemScanningDisabled;
    String nameCaptureIsOptional;
    String onDemandEmployeeId;
    String profitCenterId;
    String lOYALTYUiSystemBrandingLabel;
    String nameCaptureNameCaptureInstruction;
    String currencyCurrencyDecimalDigits;
    String lOYALTYRestrictBannedPlayers;
    String onDemandTerminalId;

    @JsonProperty("allowCartEdit")
    public String getAllowCartEdit() {
        return this.allowCartEdit;
    }

    public void setAllowCartEdit(String allowCartEdit) {
        this.allowCartEdit = allowCartEdit;
    }

    @JsonProperty("check-type")
    public String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    @JsonProperty("discountStateTitle")
    public String getDiscountStateTitle() {
        return this.discountStateTitle;
    }

    public void setDiscountStateTitle(String discountStateTitle) {
        this.discountStateTitle = discountStateTitle;
    }

    @JsonProperty("LOYALTY/uiNoTendersAvailableMsg")
    public String getLOYALTYUiNoTendersAvailableMsg() {
        return this.lOYALTYUiNoTendersAvailableMsg;
    }

    public void setLOYALTYUiNoTendersAvailableMsg(String lOYALTYUiNoTendersAvailableMsg) {
        this.lOYALTYUiNoTendersAvailableMsg = lOYALTYUiNoTendersAvailableMsg;
    }

    @JsonProperty("isSmsEnabled")
    public String getIsSmsEnabled() {
        return this.isSmsEnabled;
    }

    public void setIsSmsEnabled(String isSmsEnabled) {
        this.isSmsEnabled = isSmsEnabled;
    }

    @JsonProperty("name-capture/lastInitialOnly")
    public String getNameCaptureLastInitialOnly() {
        return this.nameCaptureLastInitialOnly;
    }

    public void setNameCaptureLastInitialOnly(String nameCaptureLastInitialOnly) {
        this.nameCaptureLastInitialOnly = nameCaptureLastInitialOnly;
    }

    @JsonProperty("currency/currencyCultureName")
    public String getCurrencyCurrencyCultureName() {
        return this.currencyCurrencyCultureName;
    }

    public void setCurrencyCurrencyCultureName(String currencyCurrencyCultureName) {
        this.currencyCurrencyCultureName = currencyCurrencyCultureName;
    }

    @JsonProperty("isMobileNumberRequired")
    public String getIsMobileNumberRequired() {
        return this.isMobileNumberRequired;
    }

    public void setIsMobileNumberRequired(String isMobileNumberRequired) {
        this.isMobileNumberRequired = isMobileNumberRequired;
    }

    @JsonProperty("hideSKULookup")
    public String getHideSKULookup() {
        return this.hideSKULookup;
    }

    public void setHideSKULookup(String hideSKULookup) {
        this.hideSKULookup = hideSKULookup;
    }

    @JsonProperty("isConceptLevelIgposConfigEnabled")
    public String getIsConceptLevelIgposConfigEnabled() {
        return this.isConceptLevelIgposConfigEnabled;
    }

    public void setIsConceptLevelIgposConfigEnabled(String isConceptLevelIgposConfigEnabled) {
        this.isConceptLevelIgposConfigEnabled = isConceptLevelIgposConfigEnabled;
    }

    @JsonProperty("isProfileValid")
    public String getIsProfileValid() {
        return this.isProfileValid;
    }

    public void setIsProfileValid(String isProfileValid) {
        this.isProfileValid = isProfileValid;
    }

    @JsonProperty("voidReasonId")
    public String getVoidReasonId() {
        return this.voidReasonId;
    }

    public void setVoidReasonId(String voidReasonId) {
        this.voidReasonId = voidReasonId;
    }

    @JsonProperty("currency/currencyCode")
    public String getCurrencyCurrencyCode() {
        return this.currencyCurrencyCode;
    }

    public void setCurrencyCurrencyCode(String currencyCurrencyCode) {
        this.currencyCurrencyCode = currencyCurrencyCode;
    }

    @JsonProperty("onDemandIgVerificationCodeId")
    public String getOnDemandIgVerificationCodeId() {
        return this.onDemandIgVerificationCodeId;
    }

    public void setOnDemandIgVerificationCodeId(String onDemandIgVerificationCodeId) {
        this.onDemandIgVerificationCodeId = onDemandIgVerificationCodeId;
    }

    @JsonProperty("useIgOrderApi")
    public String getUseIgOrderApi() {
        return this.useIgOrderApi;
    }

    public void setUseIgOrderApi(String useIgOrderApi) {
        this.useIgOrderApi = useIgOrderApi;
    }

    @JsonProperty("roomCharge/paymentIds")
    public String getRoomChargePaymentIds() {
        return this.roomChargePaymentIds;
    }

    public void setRoomChargePaymentIds(String roomChargePaymentIds) {
        this.roomChargePaymentIds = roomChargePaymentIds;
    }

    @JsonProperty("isTimeZoneValidationEnabled")
    public String getIsTimeZoneValidationEnabled() {
        return this.isTimeZoneValidationEnabled;
    }

    public void setIsTimeZoneValidationEnabled(String isTimeZoneValidationEnabled) {
        this.isTimeZoneValidationEnabled = isTimeZoneValidationEnabled;
    }

    @JsonProperty("LOYALTY/bannedPlayerMessage")
    public String getLOYALTYBannedPlayerMessage() {
        return this.lOYALTYBannedPlayerMessage;
    }

    public void setLOYALTYBannedPlayerMessage(String lOYALTYBannedPlayerMessage) {
        this.lOYALTYBannedPlayerMessage = lOYALTYBannedPlayerMessage;
    }

    @JsonProperty("LOYALTY/pinNumberLength")
    public String getLOYALTYPinNumberLength() {
        return this.lOYALTYPinNumberLength;
    }

    public void setLOYALTYPinNumberLength(String lOYALTYPinNumberLength) {
        this.lOYALTYPinNumberLength = lOYALTYPinNumberLength;
    }

    @JsonProperty("currency/currencySymbol")
    public String getCurrencyCurrencySymbol() {
        return this.currencyCurrencySymbol;
    }

    public void setCurrencyCurrencySymbol(String currencyCurrencySymbol) {
        this.currencyCurrencySymbol = currencyCurrencySymbol;
    }

    @JsonProperty("gaPaymentName")
    public String getGaPaymentName() {
        return this.gaPaymentName;
    }

    public void setGaPaymentName(String gaPaymentName) {
        this.gaPaymentName = gaPaymentName;
    }

    @JsonProperty("onDemandTenderId")
    public String getOnDemandTenderId() {
        return this.onDemandTenderId;
    }

    public void setOnDemandTenderId(String onDemandTenderId) {
        this.onDemandTenderId = onDemandTenderId;
    }

    @JsonProperty("itemScanningDisabled")
    public String getItemScanningDisabled() {
        return this.itemScanningDisabled;
    }

    public void setItemScanningDisabled(String itemScanningDisabled) {
        this.itemScanningDisabled = itemScanningDisabled;
    }

    @JsonProperty("name-capture/isOptional")
    public String getNameCaptureIsOptional() {
        return this.nameCaptureIsOptional;
    }

    public void setNameCaptureIsOptional(String nameCaptureIsOptional) {
        this.nameCaptureIsOptional = nameCaptureIsOptional;
    }

    @JsonProperty("onDemandEmployeeId")
    public String getOnDemandEmployeeId() {
        return this.onDemandEmployeeId;
    }

    public void setOnDemandEmployeeId(String onDemandEmployeeId) {
        this.onDemandEmployeeId = onDemandEmployeeId;
    }

    @JsonProperty("profit-center-id")
    public String getProfitCenterId() {
        return this.profitCenterId;
    }

    public void setProfitCenterId(String profitCenterId) {
        this.profitCenterId = profitCenterId;
    }

    @JsonProperty("LOYALTY/uiSystemBrandingLabel")
    public String getLOYALTYUiSystemBrandingLabel() {
        return this.lOYALTYUiSystemBrandingLabel;
    }

    public void setLOYALTYUiSystemBrandingLabel(String lOYALTYUiSystemBrandingLabel) {
        this.lOYALTYUiSystemBrandingLabel = lOYALTYUiSystemBrandingLabel;
    }

    @JsonProperty("name-capture/nameCaptureInstruction")
    public String getNameCaptureNameCaptureInstruction() {
        return this.nameCaptureNameCaptureInstruction;
    }

    public void setNameCaptureNameCaptureInstruction(String nameCaptureNameCaptureInstruction) {
        this.nameCaptureNameCaptureInstruction = nameCaptureNameCaptureInstruction;
    }

    @JsonProperty("currency/currencyDecimalDigits")
    public String getCurrencyCurrencyDecimalDigits() {
        return this.currencyCurrencyDecimalDigits;
    }

    public void setCurrencyCurrencyDecimalDigits(String currencyCurrencyDecimalDigits) {
        this.currencyCurrencyDecimalDigits = currencyCurrencyDecimalDigits;
    }

    @JsonProperty("LOYALTY/restrictBannedPlayers")
    public String getLOYALTYRestrictBannedPlayers() {
        return this.lOYALTYRestrictBannedPlayers;
    }

    public void setLOYALTYRestrictBannedPlayers(String lOYALTYRestrictBannedPlayers) {
        this.lOYALTYRestrictBannedPlayers = lOYALTYRestrictBannedPlayers;
    }

    @JsonProperty("onDemandTerminalId")
    public String getOnDemandTerminalId() {
        return this.onDemandTerminalId;
    }

    public void setOnDemandTerminalId(String onDemandTerminalId) {
        this.onDemandTerminalId = onDemandTerminalId;
    }
}
