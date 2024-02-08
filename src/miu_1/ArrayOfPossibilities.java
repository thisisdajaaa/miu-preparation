package miu_1;

public class ArrayOfPossibilities {
    public static boolean hasValue(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) return true;
        }

        return false;
    }

    public static int isArrayOfPossibilities(int[] array) {
        boolean hasZero = false;

        int max = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) hasZero = true;

            if (array[i] > max) max = array[i];
        }

        for (int i = 0; i <= max; i++) {
            if (!hasValue(array, i)) return 0;
        }

        if (!hasZero) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isArrayOfPossibilities(new int[] {3, 2, 1, 0}));
    }
}
