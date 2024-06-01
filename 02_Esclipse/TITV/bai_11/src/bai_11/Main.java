package bai_11;

public class Main {
	public static void main(String[] args) {
		Coordinates coordinates = new Coordinates(1, 2);
		Coordinates coordinates2 = new Coordinates(1, 5);
		Coordinates coordinates3 = new Coordinates(2, 3);

//		Shape shape = new Shape(coordinates); lỗi biên dịch 

		Shape shape = new Point(coordinates);
		Shape shape2 = new Circle(coordinates2, 2);
		Shape shape3 = new Rectangle(coordinates3, 2, 5);

		System.out.println(shape.calAcreage());
		System.out.println(shape2.calAcreage());
		System.out.println(((Rectangle) shape3).calAcreage());
	}
}
