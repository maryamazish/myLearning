package com.azish.designpattern.behavioral.mediator.sample1;

public interface IATCMediator {
    public void registerRunway(Runway runway);

    public void registerFlight(Flight flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);
}
//
