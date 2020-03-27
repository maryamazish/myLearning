//https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/

package com.azish.designpattern.behavioral.strategy;

import com.azish.designpattern.behavioral.strategy.concretestrategy.FacebookStrategy;
import com.azish.designpattern.behavioral.strategy.concretestrategy.GooglePlusStrategy;
import com.azish.designpattern.behavioral.strategy.concretestrategy.TwitterStrategy;

public class StrategyPatternMain {
    public static void main(String[] args) {

        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();

        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Lokesh");
    }
}
