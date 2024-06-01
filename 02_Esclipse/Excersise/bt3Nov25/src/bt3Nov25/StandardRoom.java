package bt3Nov25;

public class StandardRoom extends Room {

	public StandardRoom(int number) {
		super(number);
	}

	@Override
	public void cleanRoom() {
		// TODO Auto-generated method stub
		System.out.println("Standard room " + this.number + " is cleaned");
	}

}
