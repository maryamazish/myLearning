package com.azish.designpattern.structural.adapter;

public class Main {

    public static void main(String[] args) {
        EmplyeeDao emplyeeDao = new EmplyeeDao();

        //توسط آداپترEmplyeeDto به Emplyee تبدیل شد
        emplyeeDao.save(new EmployeeDtoAdapter(new EmplyeeDto()));
    }

}
