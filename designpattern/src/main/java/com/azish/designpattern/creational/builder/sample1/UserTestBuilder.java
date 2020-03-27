//package com.azish.designpattern.creational.builder.sample1;
//
//public class UserTestBuilder {
//    private final String firstName;
//    private final String lastName;
//    private int age;
//    private String phone;
//    private String address;
//
//    public UserTestBuilder(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public UserTestBuilder age(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public UserTestBuilder phone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//
//    public UserTestBuilder address(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public UserTest createUserTest() {
//        return new UserTest(firstName, lastName, age, phone, address);
//    }
//}