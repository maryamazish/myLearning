package com.azish.designpattern.behavioral.mediator.sample2;

public interface IChatRoom
{
    public void sendMessage(String msg, String userId);

    void addUser(User user);
}
