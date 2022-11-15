public class Main {
    public static void main(String[] args) {
        Employee e1 = new Cashier("saba", 3.4, 1);
        Employee e2 = new Accountant("mohammad", 2.4, 2);
        Employee e3 = new Cashier("maryam", 3.5, 3);
        Employee manager = new BankManager(1, "sara", 3.2);
        manager.add(e1);
        manager.add(e2);
        manager.add(e3);
        manager.print();
    }
}
