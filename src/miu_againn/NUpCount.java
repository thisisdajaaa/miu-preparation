package miu_againn;

public class NUpCount {
    public static int getNUpCount(int[] array, int n) {
        int sum = 0;
        int upCount = 0;

        for (int j : array) {
            boolean flag = sum <= n;

            sum += j;

            if (sum > n && flag) {
                upCount++;
            }
        }

        return upCount;
    }

    public static void main(String[] args) {
        System.out.println(getNUpCount(new int[] {2, 3, 1, -6, 8, -3, -1, 2}, 5));
    }
}
