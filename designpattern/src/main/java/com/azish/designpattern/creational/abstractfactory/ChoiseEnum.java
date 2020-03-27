package com.motaharinia.designpattern.creational.abstractfactory;

public enum ChoiseEnum {
    BANK("BANK"),
    LOAN("LOAN");

    private String value;

    ChoiseEnum(String value) {
        this.value = value;
    }
}
