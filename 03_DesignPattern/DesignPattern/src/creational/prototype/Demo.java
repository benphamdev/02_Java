package creational.prototype;

import creational.prototype.cache.BundledShapeCache;
import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Blue rectangle");
        Shape shape3 = cache.get("Big green circle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Blue rectangle (booo!)");
        }

        if (shape1 != shape3) {
            System.out.println("Big green circle is a different object (yay!)");
            if (shape1.equals(shape3)) {
                System.out.println("And it is identical to the first circle (yay!)");
            } else {
                System.out.println("But it is not identical to the first circle (booo!)");
            }
        } else {
            System.out.println("Big green circle is the same object (booo!)");
        }
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

    public void configure() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }
}
