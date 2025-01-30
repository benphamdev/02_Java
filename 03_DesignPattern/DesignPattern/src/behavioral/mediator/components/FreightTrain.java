package behavioral.mediator.components;

import behavioral.mediator.mediator.Mediator;

public class FreightTrain extends Train {

    public FreightTrain(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void arrive() {
        if (mediator.canArrive(this)) {
            System.out.println("FreightTrain: Arrival allowed");
        } else {
            System.out.println("FreightTrain: Arrival blocked, waiting");
        }
    }

    @Override
    public void depart() {
        System.out.println("FreightTrain: Leaving the station");
        mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival() {
        System.out.println("FreightTrain: Arrival permitted");
        arrive();
    }
}
