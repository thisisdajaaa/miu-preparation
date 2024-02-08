package miu_4;

public class MercurialArray {
    //    Define an array to be a Mercurial array if a 3 does not occur between any two 1s. Write a function named isMercurial
//    that returns 1 if its array argument is a Mercurial array, otherwise it returns 0.
//
//    If you are programming in Java or C#, the function signature is
//    int isMercurial(int[ ] a)
//
//    If you are programming in C or C++, the function signature is
//    int isMercurial(int a[ ], int len) where len is the number of elements in the array a.
//
//    Hint: if you encounter a 3 that is preceded by a 1, then there can be no more 1s in the array after the 3.
//
//    Examples
//
//    a is	then function returns	reason
//    {1, 2, 10, 3, 15, 1, 2, 2}	0	because 3 occurs after a 1 (a[0]) and before another 1 (a[5])
//    {5, 2, 10, 3, 15, 1, 2, 2}	1	because the 3 is not between two 1s.
//    {1, 2, 10, 3, 15, 16, 2, 2}	1	because the 3 is not between two 1s.
//    {3, 2, 18, 1, 0, 3, -11, 1, 3}	0	because a[5] is a 3 and is between a[3] and a[7] which are both 1s.
//    {2, 3, 1, 1, 18}	1	because there are no instances of a 3 that is between two 1s
//    {8, 2, 1, 1, 18, 3, 5}	1	because there are no instances of a 3 that is between two 1s
//    {3, 3, 3, 3, 3, 3}	1	because there are no instances of a 3 that is between two 1s
//    {1}	1	because there are no instances of a 3 that is between two 1s
//    {}	1	because there are no instances of a 3 that is between two 1s
    public static int isMercurial(int [] array) {
        if (array.length == 1 || array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                boolean foundThree = false;

                for (int j = i + 1; j < array.length; j++) {
                    if (i != j) {
                            if (array[j] == 3 && !foundThree) {
                                foundThree = true;
                            }

                            if (foundThree && array[j] == 1) {
                                return 0;
                            }


                    }
                }
            }

        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]  {5, 2, 10, 3, 15, 1, 2, 2}));
    }
}
