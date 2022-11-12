public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBankFactory(String bankName) {
        if (bankName==null){
            return null;
        }
        if (bankName.equals("melli")){
            return new Meli();
        } else if (bankName.equals("mellat")) {
            return new Melat();
        }
        return null;
    }

    @Override
    public Loan getLoanFactory(String loanType) {
        return null;
    }
}
