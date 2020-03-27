package com.motaharinia.designpattern.creational.abstractfactory;

import com.motaharinia.designpattern.creational.abstractfactory.bank.Bank;
import com.motaharinia.designpattern.creational.abstractfactory.bank.BankEnum;
import com.motaharinia.designpattern.creational.abstractfactory.loan.Loan;
import com.motaharinia.designpattern.creational.abstractfactory.loan.LoanEnum;

public abstract class AbstractFactory {
    public abstract Bank getBank(BankEnum bankEnum);

    public abstract Loan getLoan(LoanEnum loanEnum);
}
