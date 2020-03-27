package com.azish.designpattern.behavioral.observer.sample1;

public class Message
{
    final String messageContent;

    public Message (String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}