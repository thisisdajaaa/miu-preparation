package miu_3;

public class ReverseInteger {
    //	Question 4
//	Write a function to reverse an integer using numeric operators and without
//	using any arrays or other data structures.
//
//	The signature of the function is:
//	int f(int n)
//	Examples

    public static int getReversedInteger(int n) {
        StringBuilder string = new StringBuilder(Integer.toString(n));
        String reversed = string.reverse().toString();

        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        System.out.println(getReversedInteger(1443));
    }
}
