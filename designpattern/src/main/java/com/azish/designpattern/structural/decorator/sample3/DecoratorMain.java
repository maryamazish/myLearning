//https://virgool.io/@mohammad.ghodsian/java-decorator-design-pattern-y7nat0ejmpja

package com.azish.designpattern.structural.decorator.sample3;

public class DecoratorMain {
    public static void main(String[] args) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new HoneyDecorator(new BaseIcecream())));
        System.out.println(icecream.makeIcecream());

        icecream = new NuttyDecorator(new HoneyDecorator(new BaseIcecream()));
        System.out.println(icecream.makeIcecream());

        icecream = new BaseIcecream();
        System.out.println(icecream.makeIcecream());

        BaseIcecream baseIcecream = new BaseIcecream();




    }
}
