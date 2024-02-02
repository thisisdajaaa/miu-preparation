package miu_againn;

public class PrimeProduct {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public static int isPrimeProduct(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrime(i) && isPrime(j) && i * j == n) {
                    return 1;
                }
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
    }
}
