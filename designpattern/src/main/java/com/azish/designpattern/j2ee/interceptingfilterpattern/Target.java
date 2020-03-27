package com.azish.designpattern.j2ee.interceptingfilterpattern;

class Target
{
    public void execute(String request)
    {
        System.out.println("Executing : " + request);
    }
}
