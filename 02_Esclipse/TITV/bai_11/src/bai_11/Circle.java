package bai_11;

public class Circle extends Shape {
	private double r;

	public Circle(Coordinates coordinates, double r) {
		super(coordinates);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double calAcreage() {
		return Math.PI * this.r * this.r;
	}

}
