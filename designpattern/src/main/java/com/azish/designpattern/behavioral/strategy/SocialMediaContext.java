package com.azish.designpattern.behavioral.strategy;

import com.azish.designpattern.behavioral.strategy.concretestrategy.ISocialMediaStrategy;

public class SocialMediaContext
{
    ISocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }

    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}
