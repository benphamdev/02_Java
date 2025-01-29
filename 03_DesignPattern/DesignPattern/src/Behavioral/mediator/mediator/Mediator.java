package Behavioral.mediator.mediator;

import Behavioral.mediator.components.Train;

public interface Mediator {
    boolean canArrive(Train train);

    void notifyAboutDeparture();
}
