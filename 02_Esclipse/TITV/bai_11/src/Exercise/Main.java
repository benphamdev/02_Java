package Exercise;

public class Main {
	public static void main(String[] args) {
		ProductionCompanies companies = new ProductionCompanies("vinfast", "vietnam");
		ProductionCompanies companies2 = new ProductionCompanies("vinfast1", "vietnam");
		ProductionCompanies companies3 = new ProductionCompanies("vinfast2", "vietnam");

		Airplane airplane = new Airplane(companies3, "gas");
		Vehicle car = new Car(companies, "gasoline");
		Vehicle bicycle = new Bicycle(companies2);

		System.out.println(airplane.getNameCompany());
		airplane.takeOff();
		System.out.println(car.speed());
		System.out.println(bicycle.getNameCompany());
	}
}
