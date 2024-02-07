package polymorphism.employee_practice;

public class Engineer extends Employee {


    public Engineer(String name, int id, String position, double salary) {
        super(name, id, position, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
