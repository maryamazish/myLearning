package com.azish.designpattern.behavioral.observer.sample1.concreteobserver;

import com.azish.designpattern.behavioral.observer.sample1.Message;

public interface Observer
{
    public void update(Message m);
}
