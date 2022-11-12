public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBankFactory(String bankName) {
        return null;
    }

    @Override
    public Loan getLoanFactory(String loanType) {
        if (loanType == null) {
            return null;
        } else if (loanType.equals("car")) {
            return new CarLoan();
        } else if (loanType.equals("home")) {
            return new HomeLoan();
        }
        return null;
    }
}
