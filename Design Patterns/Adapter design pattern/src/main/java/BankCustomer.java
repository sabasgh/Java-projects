import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter the bank name: ");
        String bankName = sc.next();
        System.out.println("Now pls enter the acc holder name: ");
        String customerName = sc.next();
        System.out.println("Then pls enter the acc number: ");
        Long accNumber = sc.nextLong();
        setBankName(bankName);
        setAccNumber(accNumber);
        setAccHolderName(customerName);
    }

    @Override
    public String getCreditCard() {
        return ("The " + getAccNumber() + " of " + getAccHolderName() + " in the bank " + getBankName() +
                " is valid and authenticated for issuing the credit card !!!");
    }
    //This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class
}
