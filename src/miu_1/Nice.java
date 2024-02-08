package miu_1;

public class Nice {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isNiceArray(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                total += array[i];
            }
        }

        return total == array[0] ? 1 : 0;
     }

    public static void main(String[] args) {
        System.out.println(isNiceArray(new int[]{10, 5, 5}));
    }
}
