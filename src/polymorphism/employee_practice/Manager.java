package polymorphism.employee_practice;

public class Manager extends Employee {

    public Manager(String name, int id, String position, double salary) {
        super(name, id, position, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}
