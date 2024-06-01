package Main;

public class Booking {
	private String bookingId; // PK
	private String customerId; // FK
	private String roomId; // FK

	public Booking(String bookingId, String customerId, String roomId) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.roomId = roomId;
	}

	public String getbookingId() {
		return this.bookingId;
	}

	public void setbookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
}
