package ktdhBai14;

public class Rectangle extends Shape {
	protected double length, width;

	public Rectangle(double length, double width, String color, boolean filled) {
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

	public String toString() {
		return "-----------\n" + "Width : " + String.format("%.2f", this.width) + "Length : "
				+ String.format("%.2f", this.length) + "\nColor : " + this.color + "\nFilled : " + this.filled
				+ "\nArea : " + String.format("%.2f", getArea()) + "Perimeter : "
				+ String.format("%.2f", getPerimeter());
	}
}
