package miu_practice_2;

public class SubArray {
    //	A Sub Array is defined to be an array in which each element is greater than sum of all
//	elements after that. see example below:
//	{13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
//	{11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
//	Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
//	if you are programming in Java or C#, the function signature is: int isSub(int[] a)

    public static int isSubArray(int[] array) {
        boolean flag = true;


        int currentIndex = 0;

        while(currentIndex < array.length) {
            int total = 0;


            for (int i = 0; i < array.length; i++) {
                if (i > currentIndex) {
                    total += array[i];
                }
            }

            if (array[currentIndex] <= total) {
                flag = false;
                break;
            }

            currentIndex++;

        }

        return flag ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isSubArray(new int[] {13,6,3,2}));
    }
}
