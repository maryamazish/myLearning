package com.motaharinia.designpattern.creational.factorymethod.plan;

public enum PlanEnum {
    DOMESTIC_PLAN("DOMESTIC_PLAN"),
    COMMERCIAL_PLAN("COMMERCIAL_PLAN"),
    INSTITUTIONAL_PLAN("INSTITUTIONAL_PLAN");

    private String value;

    public String getValue() {
        return this.value;
    }

    PlanEnum(String value) {
        this.value = value;
    }
}
