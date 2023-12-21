package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion2 {
    // Find the sum of digits of a positive integer number using recursion
    // 10 is used because it will shift the decimal to the left by one digit
    public static int getSumOfDigits(int n) {
        if (n <= 0) return 0;
        return  getSumOfDigits(n / 10) + (n % 10);
    }

    // getPowerOfNumber(2, 4) = 2 * 2 * 2 * 2
    public static int getPowerOfNumber(int val, int times) {
        if (times < 0) return -1;
        if (times == 0 || times == 1) return val;

        return val * getPowerOfNumber(val, times - 1);
    }

    // getGCD n2 / n1 % n2
    public static int getGCD(int num1, int num2) {
        if (num1 < 0 || num2 < 0) return -1;
        if (num2 == 0) return num1;

        return getGCD(num2, num1 % num2);
    }

     // remainder + (10 (base decimal) * quotient)
    public static int decimalToBinary(int num) {

//        int quotient = num / 2;
//        int remainder = num % 2;
//
            if (num == 0) return 0;
//
//
//        return remainder + decimalToBinary(quotient / 2);
        return num % 2 + (10 * decimalToBinary(num / 2));
    }

    public static String[] towerBuilder(int nFloors)
    {
        List<String> tower = new ArrayList<>();
        int maxWidth = 2 * nFloors - 1;

        for (int i = 0; i < nFloors; i++) {
            int stars = 2 * i + 1;
            int spaces = (maxWidth - stars) / 2;
            String floor = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
            tower.add(floor);
        }

        return tower.toArray(new String[0]);
    }

    public static char findMissingLetter(char[] array)
    {
        int c = array[0] + 1;

        System.out.println(String.valueOf((char) c));

        for (int i = 1; i < array.length; i++, c++) {
            if ((Character.toString(array[i])).charAt(0) != c) {
                return String.valueOf((char) c).charAt(0);
            }
        }

        return ' ';
    }

    public static int findMaxNumRec (int[] array, int n) {
        if (n == 1) return array[0];

        return Math.max(array[n-1], findMaxNumRec(array, n-1));
    }

    public static void main(String[] args) {
        String[] tower = towerBuilder(3);
        char[] c = new char[] {'b', 'c', 'd'};
        int[] arr = new int[] {1, 2, 3, 4};
        System.out.println(getGCD(48, 18));

    }
}
