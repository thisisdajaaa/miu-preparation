package miu_1;

public class SumSafe {
    public static int isSumSafe(int[] array) {
        int total = 0;

        for (int k : array) {
            total += k;
        }

        for (int j : array) {
            if (j == total) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
    }
}
