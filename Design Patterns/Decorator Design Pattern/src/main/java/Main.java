import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls choose your toping for vegeterians food: ");
        System.out.println("1: Iranian foods");
        System.out.println("2: Vegeterian foods");
        System.out.println("3: Non vegeterian foods");
        int choice = sc.nextInt();
        switch (choice) {
            case 2: {
                Food veg = new VegFood();
                System.out.println(veg.prepareFood());
                System.out.println(veg.foodPrice());
            }
            break;

            case 1: {

                Food iranian = new IranianFood(new VegFood());
                System.out.println(iranian.prepareFood());
                System.out.println(iranian.foodPrice());
            }
            break;
            case 3: {

                Food nonVeg = new NonVegFood(new VegFood());
                System.out.println(nonVeg.prepareFood());
                System.out.println(nonVeg.foodPrice());
            }
            break;
            default: {
                System.out.println("Other than these no food available");
            }

        }
    }
}
