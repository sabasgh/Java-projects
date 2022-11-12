public class Melat implements Bank {
    private final String BANKNAME;

    public Melat() {
        BANKNAME = "melat";
    }

    @Override
    public String getBankName() {
        return BANKNAME;
    }
}
