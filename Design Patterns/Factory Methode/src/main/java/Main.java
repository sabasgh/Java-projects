import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the chosen plan plz (domesticPlan/specialPlan/commercialPlan: ");
        String type = scanner.nextLine();
        Plan plan = getPlanFactory.getPlan(type);
        System.out.println("Now enter the number of unit plz: ");
        int unit = scanner.nextInt();
        //call getRate() method and calculateBill()method of DomesticPlan.

        System.out.println("Then bill amount for " + type + " of " + unit + " units is ");
        plan.getRate();
        plan.calculateBill(unit);
    }
}
