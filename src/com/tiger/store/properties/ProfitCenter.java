package com.tiger.store.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfitCenter {
    boolean useProfitCenterByConcept;

    @JsonProperty("useProfitCenterByConcept")
    public boolean getUseProfitCenterByConcept() {
        return this.useProfitCenterByConcept;
    }

    public void setUseProfitCenterByConcept(boolean useProfitCenterByConcept) {
        this.useProfitCenterByConcept = useProfitCenterByConcept;
    }
}
