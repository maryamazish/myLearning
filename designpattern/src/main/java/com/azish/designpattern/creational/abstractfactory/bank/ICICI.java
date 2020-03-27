package com.motaharinia.designpattern.creational.abstractfactory.bank;

public class ICICI implements Bank {
    private final String BNAME;

    public ICICI() {
        BNAME = BankEnum.ICICI.getValue();
    }

    public String getBankName() {
        return BNAME;
    }
}
