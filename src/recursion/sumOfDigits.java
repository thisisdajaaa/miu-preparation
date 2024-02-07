package recursion;

public class sumOfDigits {
    public static int getSumOfDigits(int n) {
        if (n == 0) return 0;

        return n % 10 + getSumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(getSumOfDigits(1234));
    }
}
