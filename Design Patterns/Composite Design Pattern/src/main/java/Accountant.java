public class Accountant implements Employee {
    private String name;
    private Double salary;
    private int id;


    public Accountant(String name, Double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("=========================");
        System.out.println("Employee id is " + id);
        System.out.println("Employee name is " + name);
        System.out.println("Employee salary is " + salary);
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getEmployee(int i) {
        return null;
    }
}
