package com.azish.designpattern.structural.decorator.sample3;

public class BaseIcecream implements Icecream {
    public BaseIcecream() {
    }

    @Override
    public String makeIcecream() {
        return "Base Icecream";
    }
}
