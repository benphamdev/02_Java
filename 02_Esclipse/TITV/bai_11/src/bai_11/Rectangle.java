package bai_11;

public class Rectangle extends Shape {
	private double length, width;

	public Rectangle(Coordinates coordinates, double length, double width) {
		super(coordinates);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double calAcreage() {
		return this.length * this.width;
	}

}
