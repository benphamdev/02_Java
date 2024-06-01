package bai_2;

public class Circle extends GeometricObject {
	private double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}

}
