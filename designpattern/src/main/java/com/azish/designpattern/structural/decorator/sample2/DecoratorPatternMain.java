//https://howtodoinjava.com/design-patterns/structural/decorator-design-pattern/
package com.azish.designpattern.structural.decorator.sample2;

public class DecoratorPatternMain {
    public static void main(String[] args) {

        //ClientPopupDecorator popupDecoratored = new ClientPopupDecorator(new ClientLinkDecorator(new ClientReport()));
        //System.out.println(popupDecoratored.getFirstColumnData());

        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
    }
}
