package bt3Nov25;

import java.util.Date;

public class SuiteRoom extends Room {

	public SuiteRoom(int number) {
		super(number);
	}

	@Override
	public void cleanRoom() {
		// TODO Auto-generated method stub
		System.out.println(
				"Suite room " + this.number + " is cleaned with premium services");
	}

	public boolean bookRoom(Date date) {
		return bookRoom(date);
	}
}
