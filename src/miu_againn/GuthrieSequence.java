package miu_againn;

import java.util.ArrayList;
import java.util.List;

public class GuthrieSequence {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int isGuthrieSequence(int[] array) {
        if (array.length == 0 || array[array.length - 1] != 1) {
            return 0;
        }

        List<Integer> guthries = new ArrayList<>();

        int counter = 0;

        guthries.add(array[counter]);

        while (guthries.size() != array.length) {
            if (isEven(array[counter])) {
                guthries.add(array[counter] / 2);
            } else {
                guthries.add(array[counter] * 3 + 1);
            }

            counter++;
        }

        for (int i = 0; i < array.length; i++) {
            if (!guthries.get(i).equals(array[i])) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
    }
}
