package miu_4;

public class GuthrieSequence {
    //	Consider the following algorithm
//	- Start with a positive number n
//	- if n is even then divide by 2
//	- if n is odd then multiply by 3 and add 1
//	-* continue this until n becomes 1
//
//	The Guthrie sequence of a positive number n is defined to be the numbers generated by the above algorithm.
//
//	For example, the Guthrie sequence of the number 7 is
//	7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
//	It is easy to see that this sequence was generated from number 7 by the above algorithm.
//	Since 7 is odd, multiply by 3 and add 1 to get 22 which is the second number of the sequence.
//	Since 22 is even, divide by 2 to get 11 which is the third number of the sequence.
//	11 is odd, multiply by 3 and add 1 to get 34 which is the fourth number of the sequence and so on.
//
//	Note: the first number of a Guthrie sequence is always the number that generated the sequence and
//	the last number is always 1.
//
//	Write a function named isGuthrieSequence which returns 1 if the elements of the array form a
//	Guthrie sequence. Otherwise, it returns 0.
//	If you are programming in Java or c#, the function signature is
//	int isGuthrieSequence(int[] a)

    public static int isGuthrieSequence(int[] array) {
        if (array[array.length - 1] != 1) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                break;
            }

            if (array[i] % 2 == 0) {
                int computed = array[i] / 2;

                if (i + 1 < array.length && computed != array[i + 1]) {
                    return 0;
                }
            } else {
                int computed = array[i] * 3 + 1;

                if (i + 1 < array.length && computed != array[i + 1]) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
    }
}
