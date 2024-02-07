package polymorphism.employee_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("Eng1", 1, "wut", 1.22);
        Engineer engineer2 = new Engineer("Eng2", 3, "wut", 1.22);
        Manager manager1 = new Manager("Mng1", 2, "tuw", 2.11);

        EmployeeManager employeeManager = new EmployeeManager(new ArrayList<>());

        employeeManager.addEmployee(engineer1);
        employeeManager.addEmployee(engineer2);
        employeeManager.addEmployee(manager1);

        employeeManager.updateEmployee(3, "eng2222", "wutttt");

        employeeManager.deleteEmployee(1);

        System.out.println(employeeManager.getEmployeeById(2));

        employeeManager.getAllEmployees();


    }
}
