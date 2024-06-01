package Main;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	private String billId; // PK
	private String bookingId; // FK

	private List<Service> services = new ArrayList<Service>();// FK
	private int total;

	public Bill(String id, int total) {
		this.billId = id;
		this.total = total;
	}

	public String getbillId() {
		return this.billId;
	}

	public void setbillId(String id) {
		this.billId = id;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
}
