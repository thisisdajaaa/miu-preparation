package miu_2;

public class SumOfDigits {
    public static int getSumOfDigits(int n) {
        if (n <= 0) {
            return 0;
        }

        return getSumOfDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfDigits(55));
    }
}
