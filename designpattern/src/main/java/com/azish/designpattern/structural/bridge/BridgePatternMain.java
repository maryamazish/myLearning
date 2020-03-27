package com.azish.designpattern.structural.bridge;

import com.azish.designpattern.structural.bridge.implementor.Assemble;
import com.azish.designpattern.structural.bridge.implementor.Produce;
import com.azish.designpattern.structural.bridge.implementor.Workshop;
import com.azish.designpattern.structural.bridge.vehicle.Bike;
import com.azish.designpattern.structural.bridge.vehicle.Car;
import com.azish.designpattern.structural.bridge.vehicle.Vehicle;

public class BridgePatternMain {
    public static void main(String[] args) {
        Vehicle vehicleCar = new Car(new Produce(), new Assemble());
        vehicleCar.manufacture();

        Vehicle vehicleBike = new Bike(new Produce(), new Assemble());
        vehicleBike.manufacture();

    }
}
