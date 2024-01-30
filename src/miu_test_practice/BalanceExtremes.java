package miu_test_practice;

public class BalanceExtremes {
//    Function Signature: int f(int[] a);
//
//    The function f checks whether a given array a meets specific conditions regarding the occurrences of its minimum and maximum elements. The conditions are as follows:
//
//    The array must have at least two distinct elements.
//    The number of occurrences of the minimum value in the array must be equal to the number of occurrences of the maximum value in the array.
//    The function returns 1 if these conditions are met and -1 otherwise.
//
//            Examples:
//
//            if a is	return	reason
//              [1, 3, 31, 11]	      1	Min value 1 and max value 31 both occur once.
//              [7, 7, 7]	         -1	Array does not have at least two distinct elements.
//              [3, 3, 5, 5, 5, 7]	 -1	Min value 3 occurs twice, but max value 7 occurs once.
//              [8, 8, 6, 6]	      1	Min value 6 and max value 8 both occur twice.
//              [10, 10, 20, 20, 30]  1	Min value 10 occurs twice, but max value 30 occurs once.
//              [15, 15, 15, 15]	 -1	Array does not have at least two distinct elements.

    public static int isBalancedExtremes(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int k : array) {
            if (min > k) {
                min = k;
            }

            if (max < k) {
                max = k;
            }
        }

        if (min == max) return -1;

        int minOccurrence = 0, maxOccurrence = 0;

        for (int j : array) {
            if (min == j) {
                minOccurrence++;
            }

            if (max == j) {
                maxOccurrence++;
            }
        }

        return minOccurrence == maxOccurrence ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedExtremes(new int[] {8, 8, 6, 6}));
    }
}
