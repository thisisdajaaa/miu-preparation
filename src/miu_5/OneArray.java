package miu_5;

import java.util.ArrayList;
import java.util.List;

public class OneArray {
//    The function findIs1Array checks whether a given array a satisfies specific conditions to be considered a "1-array".
//    An array is defined as a "1-array" if it meets the following criteria:
//    The first and last elements of the array must be 1.
//    The array must contain at least one element with the value 2.
//    The array elements must be symmetrical around the central element that is the value 2.
//    The function returns 1 if the array is a "1-array" and 0 otherwise.
//
//            Examples:
//
//            if a is	return	reason
//            [1, 2, 1]         	1	Array starts and ends with 1, contains 2, and is symmetrical around 2.
//            [1, 1, 1, 2, 1, 1, 1]	1	Array starts and ends with 1, contains 2, and is symmetrical around 2.
//            [1, 1, 1, 2, 1, 3, 1]	0	Array is not symmetrical around 2.
//            [1, 1, 1, 2, 1, 1, 3]	0	Array does not end with 1.
//            [1, 1, 2, 2, 2, 1, 1]	0	Multiple 2's are present, breaking the symmetry.
//            [1, 1, 2, 1, 2, 1, 1]	0	Array is not symmetrical around a single 2.
//

    public static int isOneArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        boolean isFirstLastOne = array[0] == 1 && array[array.length - 1] == 1;
        boolean hasTwo = false;

        for (int j : array) {
            if (j == 2) {
                hasTwo = true;
                break;
            }
        }

        boolean isTwoInBetween = array[array.length / 2] == 2;

        List<String> firstItems = new ArrayList<>();
        List<String> secondItems = new ArrayList<>();

        for (int j : array) {
            firstItems.add(Integer.toString(j));
        }

        for (int i = array.length - 1; i >= 0; i--) {
            secondItems.add(Integer.toString(array[i]));
        }

        boolean isSymmetric = firstItems.toString().equals(secondItems.toString());


        return isFirstLastOne && hasTwo && isTwoInBetween && isSymmetric ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOneArray(new int[]{1, 2, 1}));
    }
}
