package miu_1;

public class Continuous {
    public static int isContinuous(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                int product = i;

                for (int j = i + 1; j < n; j++) {
                    if (n % j != 0) {
                        break;
                    }

                    product *= j;
                    if (product == n) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isContinuous(60));
    }
}
