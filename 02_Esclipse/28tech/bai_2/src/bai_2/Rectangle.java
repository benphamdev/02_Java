package bai_2;

public class Rectangle extends GeometricObject {
	private double length, width;

	public Rectangle(String color, boolean filled, double length, double width) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

}
