package miu_4;

import java.util.HashSet;
import java.util.Set;

public class CommonArray {
    //	Write a function to return an array containing all elements common to two
//	given arrays containing distinct positive integers. You should not use any inbuilt
//	methods. You are allowed to use any number of arrays.
//
//	The signature of the function is:
//	int[] f(int[] first, int[] second)

    public static int[] getCommonArray(int[] array1, int[] array2) {
        Set<Integer> commonList = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonList.add(array1[i]);
                }
            }
        }



        return commonList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] list = getCommonArray(new int[] {1, 2, 3}, new int[] {1, 4, 5});
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
