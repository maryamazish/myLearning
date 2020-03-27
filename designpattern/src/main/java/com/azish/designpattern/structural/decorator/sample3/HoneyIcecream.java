package com.azish.designpattern.structural.decorator.sample3;

public class HoneyIcecream extends BaseIcecream {
    @Override
    public String makeIcecream() {
        return super.makeIcecream() + "Honey";
    }
}
