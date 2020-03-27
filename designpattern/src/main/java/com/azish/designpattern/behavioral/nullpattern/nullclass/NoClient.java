package com.azish.designpattern.behavioral.nullpattern.nullclass;

public class NoClient extends Emp
{
    @Override
    public String getName()
    {
        return "Not Available";
    }

    @Override
    public boolean isNull()
    {
        return true;
    }
}
