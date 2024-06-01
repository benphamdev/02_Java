
public class IndividualCustomer extends Customer {

	private String name;
	private String address;

	public IndividualCustomer() {
	}

	public IndividualCustomer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getType() {
		return "individual";
	}
}
