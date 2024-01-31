package miu_practice;

public class PowerOfNumber {
    public static int getPowerOfNumber(int n, int times) {
        if (times<=1) {
            return n;
        }

        return n * getPowerOfNumber(n, times - 1);
    }

    public static void main(String[] args) {
        System.out.println(getPowerOfNumber(2, 2));
    }
}
