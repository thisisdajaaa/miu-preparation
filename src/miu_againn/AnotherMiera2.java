package miu_againn;

public class AnotherMiera2 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int isMieraArray(int[] array) {
        boolean hasZero = false;
        boolean hasPrime = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) hasZero = true;
            if (isPrime(array[i])) hasPrime = true;
        }

        return hasPrime && hasZero ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMieraArray(new int[] {7, 6, 0, 10, 1}));
    }

}
