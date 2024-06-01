package sep23ex1;

public class caColour extends Fish {
	int numberOfcolor;

	public caColour(String nameFish, String color, double weight, boolean oar, int numberOfcolor) {
		super(nameFish, color, weight, oar);
		this.numberOfcolor = numberOfcolor;
	}

	public int getNumberOfcolor() {
		return numberOfcolor;
	}

	public void setNumberOfcolor(int numberOfcolor) {
		this.numberOfcolor = numberOfcolor;
	}

	public void swim() {
		System.out.println("swim !!!");
	}

	@Override
	public String toString() {
		return super.toString() + " caColour [numberOfcolor=" + numberOfcolor + "]";
	}

}
