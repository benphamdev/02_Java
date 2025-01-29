package Behavioral.mediator.mediator;

import Behavioral.mediator.components.Train;

import java.util.ArrayDeque;
import java.util.Queue;

public class StationManager implements Mediator {
    private boolean isPlatformFree;
    private Queue<Train> trains;

    public StationManager() {
        isPlatformFree = true;
        if (trains == null) {
            System.out.println("No trains are waiting for arrival");
            trains = new ArrayDeque<>();
        }
    }

    @Override
    public boolean canArrive(Train train) {
        if (isPlatformFree) {
            isPlatformFree = false;
            return true;
        }
        trains.add(train);
        return false;
    }

    @Override
    public void notifyAboutDeparture() {
        if (!isPlatformFree) {
            isPlatformFree = true;
        }

        if (!trains.isEmpty()) {
            Train train = trains.poll();
            train.permitArrival();
        }
    }
}
