package miu_1;

public class Complete {
    public static boolean isValueFound(int[] array, int value) {
        for (int j : array) {
            if (value == j) return true;
        }

        return false;
    }

    public static int isCompleteArray(int[] array) {
        int max = 0;

        for (int k : array) {
            if (k < 0) {
                return 0;
            }

            if (max == 0 && k % 2 == 0 || k % 2 == 0 && max < k) {
                max = k;
            }
        }

        for (int j = 2; j < max; j++) {
            if (j % 2 == 0 && !isValueFound(array, j)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCompleteArray(new int[] {2, 3, 2, 4, 11, 6, 10, 9, 8}));
    }
}
