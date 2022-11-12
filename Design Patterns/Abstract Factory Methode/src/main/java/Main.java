import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Bank from where you want to take loan amount e.g. melli mellat : ");
        String bankName = sc.next();
        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        Bank bank = bankFactory.getBankFactory(bankName);
        System.out.println("Enter the interest rate for " + bank.getBankName() + ": ");
        Double rate = sc.nextDouble();
        System.out.println("Now enter the type of loan e.g. home car : ");
        String loanType = sc.next();
        System.out.println("Enter the loan amount you want to take: ");
        Double loanAmount = sc.nextDouble();
        System.out.println("Enter the number of years to pay your entire loan amount: ");
        int years = sc.nextInt();
        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan loan = loanFactory.getLoanFactory(loanType);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);

    }
}
