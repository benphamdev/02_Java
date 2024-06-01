package Exercise;

public abstract class Vehicle {
	protected String type;
	protected ProductionCompanies companies;

	public Vehicle(String type, ProductionCompanies companies) {
		this.type = type;
		this.companies = companies;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ProductionCompanies getCompanies() {
		return companies;
	}

	public void setCompanies(ProductionCompanies companies) {
		this.companies = companies;
	}

	public String getNameCompany() {
		return this.companies.getNameFirm();
	}

	public void startUp() {
		System.out.println("Start Up !");
	}

	public void acceleration() {
		System.out.println("Acceleration !");
	}

	public void shutDown() {
		System.out.println("Shut Down !");
	}

	public abstract double speed();
}
