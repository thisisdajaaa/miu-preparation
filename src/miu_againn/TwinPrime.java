package miu_againn;

public class TwinPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isTwinPrime(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (i != j && isPrime(array[j])) {
                        if (((array[j] - array[i] == 2))) {
                            return 1;
                        }
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwinPrime(new int[] {1, 17, 8, 25, 67}));
    }
}
