package Exercise;

public class Car extends Vehicle {
	private String fuel;

	public Car(ProductionCompanies companies, String fuel) {
		super("Car", companies);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public double speed() {
		return 60;
	}
}
