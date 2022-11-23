import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = scanner.nextInt();
        System.out.println("Now enter the second value: ");
        int b = scanner.nextInt();
        Context context;

        // here is the thing:
        context = new Context(new Addition());
        System.out.println("Addition: " + context.executeStrategy(a, b));

        context = new Context(new Multiplication());
        System.out.println("Multiplication :" + context.executeStrategy(a, b));

        context = new Context(new Subtraction());
        System.out.println("Subtraction : "+context.executeStrategy(a, b));

    }
}
