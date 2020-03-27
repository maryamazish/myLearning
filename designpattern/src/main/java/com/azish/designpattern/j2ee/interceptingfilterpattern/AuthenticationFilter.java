package com.azish.designpattern.j2ee.interceptingfilterpattern;

class AuthenticationFilter implements Filter
{
    public void execute(String request)
    {
        System.out.println("Authenticating : " + request);
    }
}
