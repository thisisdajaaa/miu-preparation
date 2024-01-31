package miu_practice;

public class GCD {
    public static int getGCD(int a, int b) {
        if (b <= 0) {
            return a;
        }

        return getGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(getGCD(48, 18));
    }
}
