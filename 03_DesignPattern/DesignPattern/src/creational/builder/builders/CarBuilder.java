package creational.builder.builders;

import creational.builder.cars.Car;
import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
