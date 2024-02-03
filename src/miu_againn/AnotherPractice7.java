package miu_againn;

public class AnotherPractice7 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isBunker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && i < array.length - 1 && isPrime(array[i + 1])) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBunker(new int[] {4, 9, 6, 15, 21}));
    }
}
