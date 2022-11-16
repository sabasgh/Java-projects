import java.util.HashMap;

public class ShapeFactory {
    // a factory to generate object of concrete class based on given information

    public final static HashMap<String, Circle> circlesHashmap = new HashMap<String, Circle>();

    public static Shape getCircle(String color) {
        Circle circle = circlesHashmap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circlesHashmap.put(color, circle);
            System.out.println("creating new circle in color " + color + " ....");
        }
        return circle;
    }
}
