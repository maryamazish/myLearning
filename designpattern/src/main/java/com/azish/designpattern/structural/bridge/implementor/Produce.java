package com.azish.designpattern.structural.bridge.implementor;

public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }

}
