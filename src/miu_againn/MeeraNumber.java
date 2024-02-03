package miu_againn;

public class MeeraNumber {
    public static int isMeeraNumber(int n) {
        if (n < 2) return 0;

        int counter = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (n % counter != 0) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeeraNumber(21));
    }
}
