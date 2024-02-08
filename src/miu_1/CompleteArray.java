package miu_1;

import java.util.ArrayList;
import java.util.List;

public class CompleteArray {
    public static boolean isEven(int n) {
        return n % 2 ==0;
    }

    public static int isComplete(int[] array) {
        int min = 0, max = 0;
        List<Integer> list = new ArrayList<>();


        for (int value : array) {
            boolean isValueEven = isEven(value);

            if (isValueEven && min == 0 && max == 0) {
                min = value;
                max = value;
            }


            if (min > value && isValueEven) {
                min = value;
            }

            if (value > max && isValueEven) {
                max = value;
            }

            list.add(value);
        }

        if (min == max) {
            return 0;
        }

        List<Integer> inBetween = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            inBetween.add(i);
        }

        for (Integer integer : inBetween) {
            if (!list.contains(integer)) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[] {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
    }
}
