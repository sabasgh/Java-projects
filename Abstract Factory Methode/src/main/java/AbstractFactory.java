abstract class AbstractFactory {
    // this is our AbstractFactory class to get the factories for Bank and Loan Objects

    public abstract Bank getBankFactory(String bankName);

    public abstract Loan getLoanFactory(String loanType);
}
