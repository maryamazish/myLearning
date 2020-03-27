package com.azish.designpattern.behavioral.chainofresponsibility.sample2;

public class A extends Chain {
    public A(int threshold) {
        this.Threshold = threshold;
    }

    protected void writeMessage(String msg) {
        System.out.println("A: " + msg);
    }
}
