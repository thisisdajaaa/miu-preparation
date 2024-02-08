package miu_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountSquarePairs {
    public static boolean isSquare(int n) {
        double value = Math.sqrt(n);
        return (int) value * (int) value == n;
    }

    public static int getSquarePairCount(int[] array) {
        Map<String, String> dict = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] > 0 && array[j] > 0) {
                    if (isSquare(array[i] + array[j])  && array[i] < array[j]) {
                        dict.put(i + " " + j, "<" + array[i] + "," + array[j] + ">");
                    }

                }
            }
        }

        System.out.println(dict.toString());

        return dict.size();
    }


    public static void main(String[] args) {
        System.out.println(getSquarePairCount(new int[]{9, 0, 2, -5, 7}));
    }
}
