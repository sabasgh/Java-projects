public class Shopkeeper {
    // here is the facade Class!!!!

    private Samsung samsung;
    private IPhone iPhone;

    public Shopkeeper() {
        iPhone = new IPhone();
        samsung = new Samsung();
    }

    public void samsungSale() {
        samsung.modelNumber();
        samsung.modelPrice();
    }

    public void iPhoneSale() {
        iPhone.modelNumber();
        iPhone.modelPrice();
    }
}
