//https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
package com.azish.designpattern.structural.decorator.sample1;

public class DecoratorPatternMain {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        //با توجه به آبجمکت نیو شده متدهای draw مربوطِ به هر آبجک را صدا میکند
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        //با توجه به آبجمکت نیو شده متدهای draw مربوطِ به هر آبجک را صدا میکند
        redRectangle.draw();
    }
}
