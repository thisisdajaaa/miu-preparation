package miu_practice_again;

public class SumEvenOdd {
    //	Write a function that takes an array of integers as an argument and returns a
//	value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd
//	numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
//	The signature of the function is:
//	int f(int[] a)
//	Examples:
//	 -----------------------|-----------------------------------------------------------------------
//	| if input array is     | return                                                                |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1}                   | 1                                                                     |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2}                 | -1                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2,3}               | 2                                                                     |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {1,2,3,4}             | -2                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {3,3,4,4}             | -2                                                                    |
//	|-----------------------|-----------------------------------------------------------------------|
//	| {}                    | 0                                                                     |
//	 -----------------------------------------------------------------------------------------------

    public static int sumEvenOdd(int[] array) {
        int totalEven = 0, totalOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                totalEven += array[i];
            } else {
                totalOdd += array[i];
            }
        }

        return totalOdd - totalEven;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenOdd(new int[]{1}));
    }
}
