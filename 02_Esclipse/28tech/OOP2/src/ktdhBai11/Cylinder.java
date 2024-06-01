package ktdhBai11;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(String color, double radius, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return super.getArea() * this.height;
	}

	public String toString() {
		return "Color : " + this.color + "\n" + "Height : " + String.format("%.2f", this.height) + "\n" + "Radius : "
				+ String.format("%.2f", this.radius) + "\n" + "Volume : " + String.format("%.2f", getVolume()) + "\n";
	}
}
