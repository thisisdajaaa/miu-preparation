package polymorphism.employee_practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            throw new RuntimeException("This employee already exists");
        }

        employees.add(employee);
    }

    public void updateEmployee(Integer id, String name, String position) {
        Employee foundEmployee = null;

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.get(i).setName(name);
                employees.get(i).setPosition(position);
                foundEmployee = employees.get(i);
                break;
            }
        }

        if (foundEmployee == null) throw new RuntimeException("Employee not found!");
    }

    public void deleteEmployee(Integer id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void getAllEmployees() {
        System.out.println(employees.toString());
    }

    public Employee getEmployeeById(Integer id) {
        Employee foundEmployee = null;

        for(Employee employee: employees) {
            if (employee.getId() == id) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee == null) throw new RuntimeException("Employee is not found!");

        return foundEmployee;
    }
}
