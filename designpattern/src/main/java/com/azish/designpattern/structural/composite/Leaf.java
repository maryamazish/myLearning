package com.azish.designpattern.structural.composite;

public class Leaf implements Component {
    String name;
    public Leaf(String s){
        name = s;
    }
    public void show() {
        System.out.println(name);
    }
}
