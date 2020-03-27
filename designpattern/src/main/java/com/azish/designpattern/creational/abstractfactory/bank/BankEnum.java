package com.motaharinia.designpattern.creational.abstractfactory.bank;

public enum BankEnum {
    HDFC("HDFC BANK"),
    ICICI("ICICI BANK"),
    SBI("SBI BANK");

    private String value;

    public String getValue() {
        return this.value;
    }

    BankEnum(String value) {
        this.value = value;
    }
}
