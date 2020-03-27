//https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
//https://virgool.io/@mohammad.ghodsian/java-facade-design-pattern-cl0ni2k0gamt
package com.azish.designpattern.structural.facade;

public class FacadePatternMain {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
