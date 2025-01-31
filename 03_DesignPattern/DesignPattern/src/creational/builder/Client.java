package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarManualBuilder;
import creational.builder.cars.Car;
import creational.builder.cars.Manual;
import creational.builder.director.Director;

public class Client {
    public static void main(String[] args) {
        // The client code creates a builder object, passes it to the director and then initiates the construction process.
        Director director = new Director();

        // Director gets the concrete builder object from the client (it can be any builder subclass).
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The end result is retrieved from the builder object.
        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());

        // The same director can construct a different variation of the product using another builder.
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        // The end result is retrieved from the builder object.
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
