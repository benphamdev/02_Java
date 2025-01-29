package Behavioral.mediator.components;

import Behavioral.mediator.mediator.Mediator;

public class PassengerTrain extends Train {

    public PassengerTrain(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void arrive() {
        if (mediator.canArrive(this)) {
            System.out.println("PassengerTrain: Arrival allowed.");
        } else {
            System.out.println("PassengerTrain: Arrival blocked, Waiting.");
        }
    }

    @Override
    public void depart() {
        System.out.println("PassengerTrain: Leaving the station.");
        mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival() {
        System.out.println("PassengerTrain: Arrival permitted.");
        arrive();
    }
}
