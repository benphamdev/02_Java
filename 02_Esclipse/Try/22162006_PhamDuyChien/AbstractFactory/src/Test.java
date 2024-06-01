
public class Test {
	public static void main(String[] args) {
		ShapeFactory factory = new ColorShapeFactory("red");

		Shape circle = factory.createCircle();
		ColoredRectangle rectangle = factory.createRectangle();
		Shape square = factory.createSquare();

		circle.draw();
		rectangle.draw();
		square.draw();
	}
}
