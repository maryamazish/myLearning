package com.motaharinia.designpattern.creational.factorymethod.plan;

public abstract class Plan {
    protected double rate;

    protected abstract double getRate();

    public double calculateBill(int units) {
        return units * this.getRate();
    }
}
