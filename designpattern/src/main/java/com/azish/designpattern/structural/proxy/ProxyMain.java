//https://www.geeksforgeeks.org/proxy-design-pattern/
package com.azish.designpattern.structural.proxy;

public class ProxyMain {
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
