package com.azish.designpattern.structural.decorator.sample3;

public class NuttyDecorator extends IcecreamDecorator {
    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }
    public String makeIcecream() {
        return super.makeIcecream() + addNuts();
    }
    private String addNuts() {
        return " + cruncy nuts";
    }
}
