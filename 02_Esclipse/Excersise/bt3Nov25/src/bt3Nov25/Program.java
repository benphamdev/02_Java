package bt3Nov25;

import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		hotel.addRoom(new StandardRoom(101));
		hotel.addRoom(new SuiteRoom(102));

		hotel.bookRoomForDate(101, java.sql.Date.valueOf(LocalDate.now()));
		hotel.bookRoomForDate(102, java.sql.Date.valueOf(LocalDate.now().plusDays(1)));

		hotel.cleanRooms();

	}
}
