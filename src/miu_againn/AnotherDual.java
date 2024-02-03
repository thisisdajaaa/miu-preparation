package miu_againn;

public class AnotherDual {
    public static int isAnotherDual(int[] array) {
        if (array.length % 2 != 0) return 0;

        int sum = 0;

        for (int i = 0; i < array.length; i = i + 2) {
            int innerSum = 0;

            if (sum == 0 && i < array.length - 1) {
                sum = array[i] + array[i + 1];
                continue;
            }

            if (i < array.length - 1) {
                innerSum = array[i] + array[i + 1];
            }



            if (innerSum != sum) return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isAnotherDual(new int[]  {1, 2, 2, 1, 3, 0}));
    }
}
