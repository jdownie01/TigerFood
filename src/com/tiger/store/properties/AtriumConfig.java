package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtriumConfig {
    Object terminalId;
    ManualDeduct manualDeduct;
    Tenders tenders;
    AutoDeduct autoDeduct;
    CardReaderScreenConfig cardReaderScreenConfig;

    @JsonProperty("terminalId")
    public Object getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(Object terminalId) {
        this.terminalId = terminalId;
    }

    @JsonProperty("manualDeduct")
    public ManualDeduct getManualDeduct() {
        return this.manualDeduct;
    }

    public void setManualDeduct(ManualDeduct manualDeduct) {
        this.manualDeduct = manualDeduct;
    }

    @JsonProperty("tenders")
    public Tenders getTenders() {
        return this.tenders;
    }

    public void setTenders(Tenders tenders) {
        this.tenders = tenders;
    }

    @JsonProperty("autoDeduct")
    public AutoDeduct getAutoDeduct() {
        return this.autoDeduct;
    }

    public void setAutoDeduct(AutoDeduct autoDeduct) {
        this.autoDeduct = autoDeduct;
    }

    @JsonProperty("cardReaderScreenConfig")
    public CardReaderScreenConfig getCardReaderScreenConfig() {
        return this.cardReaderScreenConfig;
    }

    public void setCardReaderScreenConfig(CardReaderScreenConfig cardReaderScreenConfig) {
        this.cardReaderScreenConfig = cardReaderScreenConfig;
    }
}
