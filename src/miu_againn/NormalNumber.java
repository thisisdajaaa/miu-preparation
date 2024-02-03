package miu_againn;

public class NormalNumber {
    public static int isNormalNumber(int n) {
        if (n <= 0) return 0;

        for (int i = 1; i <= n; i++) {
            if (i != 1 && i != n && n % i == 0 && i % 2 != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNormalNumber(8));
    }
}
