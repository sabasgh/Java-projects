import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("choose a color for circle: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("exit")) {
            ShapeFactory.getCircle(input);
            System.out.println("=================");
            System.out.println("here are the circles: ");
            getAllCircles();
            System.out.println("=================");
            System.out.println("choose another color or type exit: ");
            input = sc.nextLine();
        }


    }

    private static void getAllCircles() {
        HashMap<String, Circle> map = ShapeFactory.circlesHashmap;
        map.forEach(
                (key, value)
                        -> System.out.println(key + " circle"));
    }
}
