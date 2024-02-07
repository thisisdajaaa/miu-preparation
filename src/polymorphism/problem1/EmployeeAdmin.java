package polymorphism.problem1;


import java.util.*;

public class EmployeeAdmin {

    /**
     Returns a list of Employees whose social security number is on the input list socSecNums
     and whose salary is > 80000. The list must be ordered by social security number,
     from lowest to highest. To sort, you must use a Collections sorting method
     and you must define your own Comparator to be used to compare Employees by ssn.
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> employees = new ArrayList<>();

        for (Map.Entry<String, Employee> item: table.entrySet()) {
            if (socSecNums.contains(item.getKey()) && item.getValue().getSalary() > 80000) {
                employees.add(item.getValue());
            }
        }

        employees.sort(comparator);

        return employees;
    }

    public static final Comparator<Employee> comparator = Comparator.comparingInt(o -> Integer.parseInt(o.getSsn()));

}
