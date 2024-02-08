package miu_4;

public class PerfectSquare {
    //	Write a function nextPerfectSquare that returns the first perfect square that is greater than
//	it's integer argument. A perfect square is an integer that is equal to some integer squared.
//
//	For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
//	there is no integer n such that 15 = n*n.
//
//	The signature of the function is
//	int isPerfectSquare(int n)
//	Examples
//	 -------------------------|--------------------------------------------------------------
//	| n                       | next perfect square                                          |
//	|-------------------------|--------------------------------------------------------------|
//	| 6                       | 9                                                            |
//	|-------------------------|--------------------------------------------------------------|
//	| 36                      | 49                                                           |
//	|-------------------------|--------------------------------------------------------------|
//	| 0                       | 1                                                            |
//	|-------------------------|--------------------------------------------------------------|
//	| -5                      | 0                                                            |
//	 -------------------------|--------------------------------------------------------------

    public static boolean isPerfectSquare(int n) {
        double value = Math.sqrt(n);
        return (int) value * (int) value == n;


    }
    public static int nextPerfectSquare(int n) {
        int counter = n + 1;

        while (!isPerfectSquare(counter))  counter++;

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(-5));
    }
}
