package miu_4;

public class BeanArray {
    //	A Bean array is defined to be an integer array where for every value n in the array,
//	there is also an element 2n, 2n+1 or n/2 in the array.
//
//	for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
//	Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
//	The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
//	either the value 6, 7 or 1 and none of these values are in the array.
//	Write a function named isBean that returns 1 if it's array argument is a Bean array,
//	otherwise it returns a 0.
//	if you are programming in Java or C#, the function signature is int isBean(int[] a)

    public static int isBeanArray(int[] array) {
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if ((2 * array[i] == array[j]) || (2 * array[i] + 1  == array[j]) || (array[i] / 2 == array[j])) {
                        flag = true;
                    }
                }
            }

            if (!flag) {
                return 0;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[] {3,8,4}));
    }
}
