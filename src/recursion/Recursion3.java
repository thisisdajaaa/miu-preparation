package recursion;

public class Recursion3 {
    public static String reverseString(String value) {
        if (value.isEmpty()) return value;
        return reverseString(value.substring(1)) + value.charAt(0);
    }

    // Recursive fibo
    public static int getFibonacci(int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return n;

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    // Loop fibo
    public static int getFibo(int n) {
        int current = 1;
        int prev = 1;

        while (current < n) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }

        return current;
    }

    public static int getFactorial(int n) {
        if (n <= 0) return 0;
        if (n == 1) return n;
        return n * getFactorial(n - 1);
    }

    public static int getSumOfArray(int[] array, int index) {
        if (index >= array.length) return 0;

        return array[index] + getSumOfArray(array, index + 1);
    }

    public static int getProductOfArray(int[] array, int index) {
        if (index >= array.length) return 1;

        return array[index] * getProductOfArray(array, index + 1);
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }

        return min;
    }

    public static int recursiveMin(int[] array) {
        return getRecursiveMin(array, 0, array[0]);
    }

    public static int getRecursiveMin(int[] array, int index, int currentMin) {
        if (index >= array.length) return currentMin;

        if (array[index] < currentMin) {
            currentMin = array[index];
        }

        return getRecursiveMin(array, index + 1, currentMin);
    }

    public static int recursiveMax(int[] array) {
        return getRecursiveMax(array, 0, array[0]);
    }

    public static int getRecursiveMax(int[] array, int index, int currentMax) {
        if (index >= array.length) return currentMax;

        if (array[index] > currentMax) {
            currentMax = array[index];
        }

        return getRecursiveMax(array, index + 1, currentMax);
    }

    public static void reverseArray(int[] array) {
        getReversedArray(array, 0, array.length - 1);
    }

    public static void getReversedArray(int[] array, int start, int end) {
        if (start >= end) return;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        getReversedArray(array, start + 1, end - 1);
    }

    public static boolean isPalindrome(String value) {
        return isPalindromeHelper(value, 0, value.length() - 1);
    }

    public static boolean isPalindromeHelper(String value, int start, int end) {
        if (start >= end) return true;

        if (value.charAt(start) != value.charAt(end)) return false;

        return isPalindromeHelper(value, start + 1, end - 1);
    }

    public static int reverseInteger(int n) {
        return getReverseInteger(n, 0);
    }

    public static int getReverseInteger(int n, int reversed) {
        if (n == 0) return reversed;

        return getReverseInteger(n / 10, reversed * 10 + n % 10);
    }

    public static void main(String[] args) {
//        int[] list = new int[] {1, 2, 3, 4};
//        reverseArray(list);
//
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }

        System.out.println(reverseInteger(123));

        // System.out.println(reverseString("1234G"));
    }
}
