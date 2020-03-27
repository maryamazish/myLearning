package com.azish.designpattern.behavioral.strategy.concretestrategy;

public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}
