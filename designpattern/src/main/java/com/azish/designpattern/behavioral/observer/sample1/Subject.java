package com.azish.designpattern.behavioral.observer.sample1;

import com.azish.designpattern.behavioral.observer.sample1.concreteobserver.Observer;

public interface Subject
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
