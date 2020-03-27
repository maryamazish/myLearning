package com.azish.designpattern.j2ee.interceptingfilterpattern;

class DebugFilter implements Filter
{
    public void execute(String request)
    {
        System.out.println("Log: " + request);
    }
}