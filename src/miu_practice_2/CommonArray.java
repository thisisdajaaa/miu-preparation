package miu_practice_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonArray {
//	Write a function to return an array containing all elements common to two
//	given arrays containing distinct positive integers. You should not use any inbuilt
//	methods. You are allowed to use any number of arrays.
//
//	The signature of the function is:
//	int[] f(int[] first, int[] second)

    public static int[] getCommonArray(int[] array1, int[] array2) {
        Set<Integer> common = new HashSet<>();

        if (array1 == null || array2 == null) {
            return null;
        }

        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    common.add(k);
                }
            }
        }

        List<Integer> finalCommon = new ArrayList<>(common);

        return finalCommon.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        int[] array1 = new int[] {3,6};
        int[] array2 = new int[] {3,6} ;

        for (int i = 0; i < getCommonArray(array1, array2).length; i++) {
            System.out.println(getCommonArray(array1, array2)[i]);
        }

    }
}
