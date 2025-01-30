package behavioral.mediator.mediator;

import behavioral.mediator.components.Train;

public interface Mediator {
    boolean canArrive(Train train);

    void notifyAboutDeparture();
}
