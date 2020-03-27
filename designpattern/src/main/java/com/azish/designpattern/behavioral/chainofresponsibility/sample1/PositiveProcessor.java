package com.azish.designpattern.behavioral.chainofresponsibility.sample1;

public class PositiveProcessor implements Chain
{

    private Chain nextInChain;

    public void setNext(Chain c)
    {
        nextInChain = c;
    }

    public void process(Number request)
    {
        if (request.getNumber() > 0)
        {
            System.out.println("PositiveProcessor : " + request.getNumber());
        }
        else
        {
            nextInChain.process(request);
        }
    }
}
