//https://www.geeksforgeeks.org/template-method-design-pattern/

package com.azish.designpattern.behavioral.template;

public class TemplatePatternMain {
    public static void main(String[] args)
    {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
