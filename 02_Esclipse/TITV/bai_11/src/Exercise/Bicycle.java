package Exercise;

public class Bicycle extends Vehicle {

	public Bicycle(ProductionCompanies companies) {
		super("Bicycle", companies);
	}

	@Override
	public double speed() {
		return 10;
	}
}
