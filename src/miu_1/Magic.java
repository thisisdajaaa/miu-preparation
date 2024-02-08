package miu_1;

public class Magic {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int isMagicArray(int[] array) {
        int primeSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                primeSum += array[i];
            }
        }

        if (primeSum == 0) return 0;

        return primeSum == array[0] ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9,
                11, 4, 6}));
    }
}
