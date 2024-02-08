package miu_1;

public class FancyNumber {
    public static int isFancyNumber(int n) {
        int current = 1;
        int past = 1;

        while (true) {
            if (current > n) return 0;
            if (current == n) return 1;

            int temp = current;
            current = 3 * current + 2 * past;
            past = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(isFancyNumber(5));
    }
}
