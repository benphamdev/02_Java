
public class ColoredCircle extends Circle {
	private final String color;

	public ColoredCircle(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a colored circle: " + color);
	}
}
