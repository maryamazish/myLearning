//https://www.geeksforgeeks.org/chain-responsibility-design-pattern/

package com.azish.designpattern.behavioral.chainofresponsibility.sample1;

public class ChainMain {
    public static void main(String[] args) {
        //configure Chain of Responsibility
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        //calling chain of responsibility
        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
        c1.process(new Number(91));
    }
}
