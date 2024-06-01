package bt3Nov25;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Room implements IBookable, ICleanble {

	public int number;

	protected Map<Date, Boolean> bookingCalendar;

	protected Room(int number, Map<Date, Boolean> bookingCalendar) {
		this.number = number;
		bookingCalendar = new HashMap<Date, Boolean>();
	}

	public Room(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Map<Date, Boolean> getBookingCalendar() {
		return bookingCalendar;
	}

	public void setBookingCalendar(Map<Date, Boolean> bookingCalendar) {
		this.bookingCalendar = bookingCalendar;
	}

	@Override
	public boolean bookRoom(Date date) {
		// TODO Auto-generated method stub
		if (bookingCalendar.containsValue(date)
				&& bookingCalendar.get(date).booleanValue()) {
			bookingCalendar.put(date, true);
			return true;
		}
		return false;
	}

	@Override
	public void releaseRoom(Date date) {
		// TODO Auto-generated method stub
		if (bookingCalendar.containsKey(date)) {
			bookingCalendar.put(date, false);
		}
	}

	public abstract void cleanRoom();
}
