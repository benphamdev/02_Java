package Main;

public class Service {
	private String serviceId; // PK
	private String nameService;
	private int price;

	public Service(String serviceId, String nameService, int price) {
		this.serviceId = serviceId;
		this.nameService = nameService;
		this.price = price;
	}

	public String getserviceId() {
		return serviceId;
	}

	public void setserviceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getnameService() {
		return nameService;
	}

	public void setnameService(String nameService) {
		this.nameService = nameService;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
