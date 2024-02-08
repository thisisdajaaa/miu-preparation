package miu_1;

public class AnotherBunker {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isAnotherBunker(int[] array) {
        int primeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                for (int j = 0; j < array.length; j++) {
                    if (i != j && isPrime(array[j])) primeCount++;
                }
            }
        }

        return primeCount > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isAnotherBunker(new int[] {7, 6, 10}));
    }
}
