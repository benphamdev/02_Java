package ktdhBai14;

public class Circle extends Shape {
	protected double radius = 1.0;

	public Circle(double radius, String color, boolean filled) {
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

	public String toString() {
		return "-----------\n" + "Radius : " + String.format("%.2f", this.radius) + "\nColor : " + this.color
				+ "\nFilled : " + this.filled + "\nArea : " + String.format("%.2f", getArea()) + "Perimeter : "
				+ String.format("%.2f", getPerimeter());
	}
}
