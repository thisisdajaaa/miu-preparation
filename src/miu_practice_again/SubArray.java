package miu_practice_again;

public class SubArray {
    //	A Sub Array is defined to be an array in which each element is greater than sum of all
//	elements after that. see example below:
//	{13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
//	{11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
//	Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
//	if you are programming in Java or C#, the function signature is: int isSub(int[] a)

    public static int isSubArray(int[] array) {
        int indexToCheck = 0;

        while(indexToCheck < array.length) {
            int total = 0;


            for (int i = indexToCheck; i < array.length; i++) {
                if (indexToCheck != i) {
                    total += array[i];
                }
            }

            if (array[indexToCheck] <= total) {
                return 0;
            }

            indexToCheck++;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSubArray(new int[] {13,6,3,2}));
    }
}
