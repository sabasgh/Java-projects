public class AdapterPatternDemo {
    //This class will interact with the Adapter class
    public static void main(String[] args) {
        CreditCard bc = new BankCustomer();
        bc.giveBankDetails();
        System.out.println(bc.getCreditCard());
    }
}
