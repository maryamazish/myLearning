package com.azish.designpattern.behavioral.observer.sample1.concreteobserver;

import com.azish.designpattern.behavioral.observer.sample1.Message;

public class MessageSubscriberThree implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}