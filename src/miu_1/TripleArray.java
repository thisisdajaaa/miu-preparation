package miu_1;

public class TripleArray {
    public static int isTripleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) count++;
            }

            if (count != 3) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isTripleArray(new int[]  {3, 1, 2, 1, 3, 1, 3, 2, 2}));
    }
}
