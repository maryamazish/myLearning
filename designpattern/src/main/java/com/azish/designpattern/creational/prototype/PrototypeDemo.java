package com.azish.designpattern.creational.prototype;

import com.azish.designpattern.creational.builder.sample1.User;

public class PrototypeDemo {


    public static void main(String[] var0) {

        User user = new User.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();
        EmployeeRecord var8 = new EmployeeRecord(12, "var3", "var4", 8d, "var5", user);
        var8.showRecord();

        System.out.println("\n" + var8.hashCode());

        EmployeeRecord var9 = (EmployeeRecord) var8.getClone();
        //ست کردن مقادیر جدید در آبجکت کلن شده
        var9.name = "babak";
        var9.user = new User.UserBuilder("fatemeh", "azish").build();
        var9.showRecord();

        System.out.println(var8.hashCode());
        System.out.println("name=" + var8.name.hashCode());
        System.out.println("user=" + var8.user.hashCode());
        System.out.println(var9.hashCode());
        System.out.println("name clone =" + var9.name.hashCode());
        System.out.println("user clone =" + var9.user.hashCode());
    }
}
