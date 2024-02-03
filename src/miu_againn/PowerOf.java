package miu_againn;

public class PowerOf {
    public static int isPowerOf(int value, int power) {
        if (value == 0) return 0;

        while(value != 1) {
            if (value % power != 0) return 0;

            value = value / power;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf(4, 2));
    }
}

// get remaining array.length - i - 1;
// is fibo isSquare(5 * n * n + 4) || isSquare(5 * n * n - 4)
// fibo f(n -1) + f(n - 2)
// factorial n * f(n - 1)
// power n * f(n, times - 1)
// sum of digits n % 10 + f(n/10)
// decimal to binary n % 2 + (10 * f(n/2))
// GCD f(b, a % b)
