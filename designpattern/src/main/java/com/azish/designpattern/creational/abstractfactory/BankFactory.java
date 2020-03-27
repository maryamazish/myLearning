package com.motaharinia.designpattern.creational.abstractfactory;

import com.motaharinia.designpattern.creational.abstractfactory.bank.*;
import com.motaharinia.designpattern.creational.abstractfactory.loan.Loan;
import com.motaharinia.designpattern.creational.abstractfactory.loan.LoanEnum;

public class BankFactory extends AbstractFactory {
    public Bank getBank(BankEnum bankEnum) {
        if (bankEnum == null) {
            return null;
        } else {
            switch (bankEnum) {
                case HDFC:
                    return new HDFC();
                case ICICI:
                    return new ICICI();
                case SBI:
                    return new SBI();
                default:
                    return null;
            }
        }
    }

    public Loan getLoan(LoanEnum loanEnum) {
        return null;
    }
}
