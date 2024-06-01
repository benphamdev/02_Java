package bt3Nov25;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Hotel {

	private List<Room> rooms;

	public Hotel() {
		rooms = new ArrayList<>();
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public boolean bookRoomForDate(int roomNumber, Date date) {
		Optional<Room> room = rooms.stream().filter(r -> r.getNumber() == roomNumber)
				.findFirst();
		return true ? room.isPresent() : false;
	}

	public void cleanRooms() {
		for (Room room : rooms) {
			room.cleanRoom();
		}
	}
}
