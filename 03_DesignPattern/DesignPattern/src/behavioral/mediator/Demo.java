package behavioral.mediator;

import behavioral.mediator.components.FreightTrain;
import behavioral.mediator.components.PassengerTrain;
import behavioral.mediator.mediator.StationManager;

public class Demo {
    public static void main(String[] args) {
        // The client code.
        var stationManager = new StationManager();
        var passengerTrain = new PassengerTrain(stationManager);
        var freightTrain = new FreightTrain(stationManager);
        passengerTrain.arrive();
        freightTrain.arrive();
        passengerTrain.depart();
    }
}
