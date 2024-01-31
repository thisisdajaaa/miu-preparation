package miu_againn;

public class NUnique {
    public static int isNUnique(int[] array, int n) {
        int counter = 0;

        if (array.length < 2) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (counter > 2) {
                return 0;
            }

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == n) {
                    counter++;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]  {1}, 11));
    }
}
