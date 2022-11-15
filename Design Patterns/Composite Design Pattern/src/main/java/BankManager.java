import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {
    private int id;
    private String name;
    private Double salary;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public BankManager(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employeeList = new ArrayList<Employee>();

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
        for (Employee employee : employeeList) {
            System.out.println("=========================");
            System.out.println("Employee id is :" + employee.getId());
            System.out.println("Employee name is :" + employee.getName());
            System.out.println("Employee salary is :" + employee.getSalary());
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee getEmployee(int i) {
        return employeeList.get(i);
    }
}
