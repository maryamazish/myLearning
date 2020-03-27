package com.azish.designpattern.behavioral.chainofresponsibility.sample1;

public interface Chain
{
    public abstract void setNext(Chain nextInChain);
    public abstract void process(Number request);
}
