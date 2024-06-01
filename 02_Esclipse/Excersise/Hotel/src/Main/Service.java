package Main;

public class Service {
	private String serviceId; // PK
	private String nameService;
	private int price;

	public Service(String id, String name, int price) {
		this.serviceId = id;
		this.nameService = name;
		this.price = price;
	}

	public String getserviceId() {
		return serviceId;
	}

	public void setserviceId(String id) {
		this.serviceId = id;
	}

	public String getnameService() {
		return nameService;
	}

	public void setnameService(String name) {
		this.nameService = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
