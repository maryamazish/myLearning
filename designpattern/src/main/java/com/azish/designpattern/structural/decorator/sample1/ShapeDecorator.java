package com.azish.designpattern.structural.decorator.sample1;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }
}