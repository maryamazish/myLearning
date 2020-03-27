package com.azish.designpattern.structural.decorator.sample3;

public class NuttyIcecream extends BaseIcecream {
    @Override
    public String makeIcecream() {
        return super.makeIcecream() + "Nutty";
    }
}
