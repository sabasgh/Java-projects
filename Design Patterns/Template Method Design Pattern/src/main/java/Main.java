import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi please choose the game U want to play!");
        System.out.println("1 - Chess");
        System.out.println("2 - Soccer");
        int choice = scanner.nextInt();
        Game game;
        if (choice == 1) {
            game = new Chess();
        } else {
            game = new Soccer();
        }
        game.initialize();
        game.start();
        game.end();
    }
}
