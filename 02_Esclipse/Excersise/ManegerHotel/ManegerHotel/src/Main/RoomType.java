package Main;

public class RoomType {
	private String roomTypeId; // PK
	private String nameRoomType;
	private int price;

	public RoomType(String roomTypeId, String nameRoomType, int price) {
		this.roomTypeId = roomTypeId;
		this.nameRoomType = nameRoomType;
		this.price = price;
	}

	public String getroomTypeId() {
		return roomTypeId;
	}

	public void setroomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getnameRoomType() {
		return nameRoomType;
	}

	public void setnameRoomType(String nameRoomType) {
		this.nameRoomType = nameRoomType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
