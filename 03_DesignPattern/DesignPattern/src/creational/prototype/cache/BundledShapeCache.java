package creational.prototype.cache;

import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private static Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";
        cache.put("Big green circle", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "Blue";
        cache.put("Blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
