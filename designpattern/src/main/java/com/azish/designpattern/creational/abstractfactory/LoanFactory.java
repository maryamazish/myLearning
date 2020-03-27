package com.motaharinia.designpattern.creational.abstractfactory;

import com.motaharinia.designpattern.creational.abstractfactory.bank.Bank;
import com.motaharinia.designpattern.creational.abstractfactory.bank.BankEnum;
import com.motaharinia.designpattern.creational.abstractfactory.loan.*;

public class LoanFactory extends AbstractFactory {
    public Bank getBank(BankEnum bankEnum) {
        return null;
    }

    public Loan getLoan(LoanEnum loanEnum) {
        if (loanEnum == null) {
            return null;
        } else {
            switch (loanEnum) {
                case BUSINESS:
                    return new BusinessLoan();
                case EDUCATIONAL:
                    return new EducationLoan();
                case HOME:
                    return new HomeLoan();
                default:
                    return null;
            }
        }
    }
}
