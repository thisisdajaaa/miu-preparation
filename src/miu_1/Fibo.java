package miu_1;

public class Fibo {
    public static boolean isSquare(int n) {
        int value = (int) Math.sqrt(n);
        return value * value == n;
    }
    public static int isFibonacci(int n) {
        return isSquare(5 * n * n + 4) || isSquare(5 * n * n - 4) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
    }
}
