package com.tiger.config; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class AtriumConfig{
    @JsonProperty("terminalId") 
    public Object getTerminalId() { 
		 return this.terminalId; } 
    public void setTerminalId(Object terminalId) { 
		 this.terminalId = terminalId; } 
    Object terminalId;
    @JsonProperty("manualDeduct") 
    public ManualDeduct getManualDeduct() { 
		 return this.manualDeduct; } 
    public void setManualDeduct(ManualDeduct manualDeduct) { 
		 this.manualDeduct = manualDeduct; } 
    ManualDeduct manualDeduct;
    @JsonProperty("tenders") 
    public Tenders getTenders() { 
		 return this.tenders; } 
    public void setTenders(Tenders tenders) { 
		 this.tenders = tenders; } 
    Tenders tenders;
    @JsonProperty("autoDeduct") 
    public AutoDeduct getAutoDeduct() { 
		 return this.autoDeduct; } 
    public void setAutoDeduct(AutoDeduct autoDeduct) { 
		 this.autoDeduct = autoDeduct; } 
    AutoDeduct autoDeduct;
    @JsonProperty("cardReaderScreenConfig") 
    public CardReaderScreenConfig getCardReaderScreenConfig() { 
		 return this.cardReaderScreenConfig; } 
    public void setCardReaderScreenConfig(CardReaderScreenConfig cardReaderScreenConfig) { 
		 this.cardReaderScreenConfig = cardReaderScreenConfig; } 
    CardReaderScreenConfig cardReaderScreenConfig;
}
