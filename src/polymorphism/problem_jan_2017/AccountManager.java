package polymorphism.problem_jan_2017;

import java.util.List;

public class AccountManager {
    public static double computeAccountBalanceSum(List<Employee> emps) {
        double sum = 0;

        for (Employee employee : emps) {
            for (Account account : employee.getAccounts()) {
                sum += account.getBalance();
            }
        }

        return sum;

    }
}
