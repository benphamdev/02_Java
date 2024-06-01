package ktdhBai14;

public class Square extends Rectangle {

	public Square(double length, double width, String color, boolean filled) {
		super(length, width, color, filled);
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
		return "-----------\n" + "Size : " + String.format("%.2f", this.width) + "\nColor : " + this.color
				+ "\nFilled : " + this.filled + "\nArea : " + String.format("%.2f", getArea()) + "Perimeter : "
				+ String.format("%.2f", getPerimeter());
	}
}
