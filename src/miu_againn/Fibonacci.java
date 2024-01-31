package miu_againn;

public class Fibonacci {
    public static boolean isPerfectSquare(int n) {
        int value = (int) Math.sqrt(n);
        return value * value == n;
    }
    public static int getFibonacci(int n) {
        if (n <= 1) return n;

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static int isFibonacci(int n) {

        return isPerfectSquare(5 * n * n - 4) || isPerfectSquare(5 * n * n + 4) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(1));
        System.out.println(100 * 101 / 2);
    }
}

// is fibo = perfectSquare(5 * n * n + 4) || perfectSquare(5 * n * n - 4)
// get fibo = f(n - 1) + f(n - 2)
// factorial = n * f(n - 1)
// power = n * f(n, times - 1)
// GCD = f(b, a % b)
// get sum of range = n * (n + 1) / 2
// get sum of digits = f(n / 10) + n % 10
// Decimal to Binary = n % 2 + (10 * f(n / 2))