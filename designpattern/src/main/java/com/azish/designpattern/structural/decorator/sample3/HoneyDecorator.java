package com.azish.designpattern.structural.decorator.sample3;

public class HoneyDecorator extends IcecreamDecorator {
    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }
    public String makeIcecream() {
        return super.makeIcecream() + addHoney();
    }
    private String addHoney() {
        return " + sweet honey";
    }
}
