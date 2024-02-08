package miu_3;

public class TwoConditions {

//	Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
//	1. it has even numbers of elements
//	2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.
//
//	If you are programming in Java, the function Signature is
//	int answerThree(int[] a)
//	Examples
//	 -------------------|--------|-----------------------------------------------------------------------
//	| a                 | return | Explanation                                                           |
//	|-------------------|--------|-----------------------------------------------------------------------|
//	| {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
//	|                   |        | satisfied.                                                            |
//	|                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
//	 -------------------|--------|-----------------------------------------------------------------------

    public static int isTwoConditions(int[] array) {
        boolean isAllEven = array.length % 2 == 0;

        int firstHalfTotal = 0;
        int secondHalfTotal = 0;

        for (int i = 0; i < array.length; i++) {
            int firstHalf = array.length / 2;

            if (i < firstHalf) {
                firstHalfTotal += array[i];
            } else {
                secondHalfTotal += array[i];
            }
        }

        if (isAllEven && firstHalfTotal == secondHalfTotal) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isTwoConditions(new int[] {5,4,3,2,3,4,6,1}));
    }
}
