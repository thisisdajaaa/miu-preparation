package miu_1;

public class DualArray {
    public static int isDualArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) count++;

            }

            if (count != 2) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDualArray(new int[] {1, 2, 1, 3, 3, 2}));
    }
}
