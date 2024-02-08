package miu_1;

import java.util.ArrayList;
import java.util.List;

public class Henry {
    public static boolean isPerfectNumber(int n) {
        List<Integer> items = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                items.add(i);
            }
        }

        int total = 0;

        for (Integer item : items) {
            total += item;
        }

        return total == n;
    }

    public static int getHenry(int num1, int num2) {
        List<Integer> perfectNumbers = new ArrayList<>();

        int limit = 10000;

        for (int i = 1; i < limit; i++) {
            if (isPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }

        System.out.println(perfectNumbers.toString());

        if (num1 <= perfectNumbers.size() && num2 <= perfectNumbers.size()) {
            return perfectNumbers.get(num1 - 1) + perfectNumbers.get(num2- 1);
        } else {
            throw new IllegalArgumentException("The argument/s do not exist within limit");
        }


    }

    public static void main(String[] args) {
        System.out.println(getHenry(1, 4));
    }
}
