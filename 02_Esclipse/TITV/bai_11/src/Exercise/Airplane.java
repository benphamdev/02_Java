package Exercise;

public class Airplane extends Vehicle {
	private String fuel;

	public Airplane(ProductionCompanies companies, String fuel) {
		super("Airplane", companies);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public void takeOff() {
		System.out.println("take off !");
	}

	public void land() {
		System.out.println("land !");
	}

	@Override
	public double speed() {
		return 500;
	}
}
