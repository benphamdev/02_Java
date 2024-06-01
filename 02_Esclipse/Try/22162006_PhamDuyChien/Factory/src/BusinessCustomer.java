
public class BusinessCustomer extends Customer {
	private String name;
	private String address;
	private String businessName;

	public BusinessCustomer() {
	}

	public BusinessCustomer(String name, String address, String businessName) {
		this.name = name;
		this.address = address;
		this.businessName = businessName;
	}

	@Override

	public String getName() {
		return name;
	}

	@Override

	public String getAddress() {
		return address;
	}

	@Override

	public String getType() {
		return "business";
	}
}
