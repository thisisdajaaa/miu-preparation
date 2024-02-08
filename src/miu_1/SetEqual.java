package miu_1;

public class SetEqual {
    public static boolean isValueFound(int value, int[] array) {
        for (int j : array) {
            if (j == value) return true;
        }

        return false;
    }

    public static int isSetEqual(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!isValueFound(array1[i], array2)) {
                return 0;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (!isValueFound(array2[i], array1)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1,
                9, 12, 9, 12, 1, 9}));
    }
}
