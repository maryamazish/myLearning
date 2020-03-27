package com.motaharinia.designpattern.creational.abstractfactory.loan;

public enum LoanEnum {
    BUSINESS("BUSINESS"),
    EDUCATIONAL("EDUCATIONAL"),
    HOME("HOME");

    private String value;

    public String getValue() {
        return this.value;
    }

    LoanEnum(String value) {
        this.value = value;
    }
}
