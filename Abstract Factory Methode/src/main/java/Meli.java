public class Meli implements Bank {
    private final String BANKNAME;

    public Meli() {
        BANKNAME = "meli";
    }

    @Override
    public String getBankName() {
        return BANKNAME;
    }
}
