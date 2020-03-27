package com.azish.designpattern.structural.decorator.sample1;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        this.setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border Color: Red");
    }
}
