package miu_1;

public class Matches {
    public static int isMatches(int[] array1, int[] array2) {
        int temp = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = i == 0 ? 0 : temp; j < array2[i]; j++) {
                boolean isNegative = array2[i] < 0;

                if (isNegative && array1[j] > 0 || !isNegative && array1[j] < 0) {
                    return 0;
                }
            }

            temp += Math.abs(array2[i]);

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMatches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3})); // Should return 1
        System.out.println(isMatches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3})); // Should return 0
        System.out.println(isMatches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3})); // Should return 0
    }
}
