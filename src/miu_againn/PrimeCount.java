package miu_againn;

public class PrimeCount {
    public static boolean isPrime (int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getPrimeCount (int start, int end) {
        int tracker = 0;

        for (int i = start; i <= end ; i++) {
            if (isPrime(i)) tracker++;
        }

        return tracker;
    }

    public static void main(String[] args) {
        System.out.println(getPrimeCount(10, 30));
    }
}
