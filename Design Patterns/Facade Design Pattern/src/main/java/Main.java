import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopkeeper shopkeeper = new Shopkeeper();

        System.out.println("==== Mobile Shop ==== ");
        System.out.println("Plz enter the chosen brand: ");
        System.out.println("1- Samsung");
        System.out.println("2- iPhone");

        switch (sc.nextInt()) {
            case 1: {
                shopkeeper.samsungSale();
            }
            break;

            case 2: {
                shopkeeper.iPhoneSale();
            }
        }
    }
}
