package com.azish.designpattern.creational.prototype;

import com.azish.designpattern.creational.builder.sample1.User;

public class EmployeeRecord implements Prototype{
    int id;
    String name;
    String designation;
    double salary;
    String address;
    User user;


    EmployeeRecord(int var1, String var2, String var3, double var4, String var6,User user) {
        this.id = var1;
        this.name = var2;
        this.designation = var3;
        this.salary = var4;
        this.address = var6;
        this.user = user;
    }

    void showRecord() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.designation + "\t" + this.salary + "\t" + this.address + "\t" + this.user);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,designation,salary,address,user);
    }
}
