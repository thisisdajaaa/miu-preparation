package miu_againn;

public class ArrayHasNoZeroes {
    public static int hasZeroInArray(int[] array) {
        for (int j : array) {
            if (j == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(hasZeroInArray(new int[] {1, 2, 3, 4}));
    }
}
