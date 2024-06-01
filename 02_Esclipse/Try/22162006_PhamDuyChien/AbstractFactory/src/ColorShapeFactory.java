public class ColorShapeFactory implements ShapeFactory {
	private final String color;

	public ColorShapeFactory(String color) {
		this.color = color;
	}

	public ColoredCircle createCircle() {
		return new ColoredCircle(color);

	}

	@Override
	public ColoredRectangle createRectangle() {
		return new ColoredRectangle(color);
	}

	@Override
	public ColoredSquare createSquare() {
		return new ColoredSquare(color);
	}
}
