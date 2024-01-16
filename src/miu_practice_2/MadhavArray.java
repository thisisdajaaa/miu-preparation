package miu_practice_2;

public class MadhavArray {
//	A Madhav array has the following property.
//	a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
//	The length of a Madhav array must be n*(n+1)/2 for some n.
//	Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
//	otherwise it returns 0. If you are programming in Java or C# the function signature is
//	int isMadhavArray(int[] a)
//
//	Examples
//	 -----------------------------------|-------|---------------------------------------------------
//	| if a is                           | return| reason                                            |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {2,1,1}                           | 1     | 2 = 1 + 1                                         |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {2,1,1,4,-1,-1}                   | 1     | 2 = 1 + 1, 2 = 4 + -1 + -1                        |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {6,2,4,2,2,2,1,5,0,0}             | 1     | 6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0       |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {18,9,10,6,6,6}                   | 0     | 18 != 9 + 10                                      |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {-6,-3,-3,8,-5,-4}                | 0     | -6 != 8 + -5 + -4                                 |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} | 1     | 0 = 0+0, 0 = 0+0+0, 0 = 0+0+0+0, 0 = 1+1+1+-2+-1  |
//	|-----------------------------------|-------|---------------------------------------------------|
//	| {3,1,2,3,0}                       | 0     | The length of the array is 5, but 5 != n*(n+1)/2  |
//	 -----------------------------------|-------|---------------------------------------------------

    public static int isMadhav(int[] array) {
        if (array.length < 3) {
            return 0;
        }

        int isValidLength = 0;

        for (int i = 1; i <= array.length; i++) {
            if (array.length == i * (i + 1) / 2) {
                isValidLength = 1;
            }
        }

        if (isValidLength == 0) {
            return 0;
        }

        int currentTemp = array[0];
        int sum = 0;
        int count = 2;
        int indexCheck = 2;

        for (int i = 1; i < array.length; i++) {
            if (i <= indexCheck) {
                sum+= array[i];
            } else {
                if (currentTemp != sum) {
                    return 0;
                } else {
                    sum = 0;
                    count = count + 1;
                    indexCheck = count + i - 1;
                    sum += array[i];
                }
            }
        }

        return currentTemp == sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMadhav(new int[] {2,1,1}));
    }
}
