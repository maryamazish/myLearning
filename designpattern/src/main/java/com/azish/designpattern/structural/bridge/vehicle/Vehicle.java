//https://www.geeksforgeeks.org/bridge-design-pattern/

package com.azish.designpattern.structural.bridge.vehicle;


import com.azish.designpattern.structural.bridge.implementor.Workshop;

// abstraction in bridge pattern
public abstract class Vehicle {
    public Workshop workShop1;
    public Workshop workShop2;

    public Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}
