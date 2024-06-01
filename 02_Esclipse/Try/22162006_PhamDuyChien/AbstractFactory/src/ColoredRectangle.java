import java.awt.Rectangle;

public class ColoredRectangle extends Rectangle {
	private final String color;

	public ColoredRectangle(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Drawing a colored rectangle: " + color);
	}
}
