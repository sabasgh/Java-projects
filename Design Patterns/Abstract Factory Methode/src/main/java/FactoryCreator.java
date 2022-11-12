public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        } else if (factoryType.equals("bank")) {
            return new BankFactory();
        } else if (factoryType.equals("loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
