package com.motaharinia.designpattern.creational.abstractfactory.bank;

public class SBI implements Bank {
    private final String BNAME;

    public SBI() {
        BNAME = BankEnum.SBI.getValue();
    }

    public String getBankName() {
        return BNAME;
    }
}
