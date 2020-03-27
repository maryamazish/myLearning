package com.azish.designpattern.behavioral.chainofresponsibility.sample2;

public class B extends Chain {
    public B(int threshold) {
        this.Threshold = threshold;
    }

    protected void writeMessage(String msg) {
        System.out.println("B: " + msg);
    }
}
