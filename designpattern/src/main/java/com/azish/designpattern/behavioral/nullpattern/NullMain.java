package com.azish.designpattern.behavioral.nullpattern;

import com.azish.designpattern.behavioral.nullpattern.nullclass.Emp;

public class NullMain {
    public static void main(String[] args)
    {
        Emp emp1 = EmpData.getClient("Lokesh");
        Emp emp2 = EmpData.getClient("Kushagra");
        Emp emp3 = EmpData.getClient("Vikram");
        Emp emp4 = EmpData.getClient("Rishabh");


        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}
