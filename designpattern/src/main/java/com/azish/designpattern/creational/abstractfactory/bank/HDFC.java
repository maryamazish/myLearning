package com.motaharinia.designpattern.creational.abstractfactory.bank;

public class HDFC implements Bank {
    private final String BNAME;

    public HDFC() {
        BNAME = BankEnum.HDFC.getValue();
    }

    public String getBankName() {
        return BNAME;
    }
}
