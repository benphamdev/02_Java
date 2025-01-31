package creational.builder.cars;

import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(
            CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator
    ) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder info = new StringBuilder();
        info.append("Car type: ");
        info.append(carType);
        info.append("\n");
        info.append("Seats: ");
        info.append(seats);
        info.append("\n");
        info.append("Engine: ");
        info.append("volume - %s; mileage - %s".formatted(engine.getVolume(), engine.getMileage()));
        info.append("\n");
        info.append("Transmission: ");
        info.append(transmission);
        info.append("\n");
        if (this.tripComputer != null) {
            info.append("Trip Computer: Functional");
            info.append("\n");
        } else {
            info.append("Trip Computer: N/A");
            info.append("\n");
        }
        if (this.gpsNavigator != null) {
            info.append("GPS Navigator: Functional");
            info.append("\n");
        } else {
            info.append("GPS Navigator: N/A");
            info.append("\n");
        }
        return info.toString();
    }
}
