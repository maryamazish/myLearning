package com.motaharinia.designpattern.creational.abstractfactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(ChoiseEnum choiceEnum) {
        if (choiceEnum == null) {
            return null;
        } else {
            switch (choiceEnum) {
                case BANK:
                    return new BankFactory();
                case LOAN:
                    return new LoanFactory();
                default:
                    return null;
            }
        }
    }
}
