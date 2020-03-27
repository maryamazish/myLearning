package com.azish.designpattern.behavioral.nullpattern.nullclass;

public class Coder extends Emp
{
    public Coder(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
