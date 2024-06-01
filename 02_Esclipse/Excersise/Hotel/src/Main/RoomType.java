package Main;

public class RoomType {
	private String roomTypeId; // PK
	private String nameRoomType;
	private int price;

	public RoomType(String id, String name, int price) {
		this.roomTypeId = id;
		this.nameRoomType = name;
		this.price = price;
	}

	public String getroomTypeId() {
		return roomTypeId;
	}

	public void setroomTypeId(String id) {
		this.roomTypeId = id;
	}

	public String getnameRoomType() {
		return nameRoomType;
	}

	public void setnameRoomType(String name) {
		this.nameRoomType = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
