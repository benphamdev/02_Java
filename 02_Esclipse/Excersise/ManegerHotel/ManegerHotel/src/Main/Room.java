package Main;

public class Room {
	private String roomId; // PK
	private String roomTypeId; // FK
	private String status;

	public Room(String roomId, String status, String roomTypeId) {
		this.roomId = roomId;
		this.status = status;
		this.roomTypeId = roomTypeId;
	}

	public String getroomId() {
		return roomId;
	}

	public void setroomId(String roomId) {
		this.roomId = roomId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
}
