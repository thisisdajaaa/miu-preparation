package miu_4;

public class ReverseInteger {
    //	Question 4
//	Write a function to reverse an integer using numeric operators and without
//	using any arrays or other data structures.
//
//	The signature of the function is:
//	int f(int n)
//	Examples

    public static int getReverseInteger(int n) {
        StringBuilder value = new StringBuilder();
        value.append(Math.abs(n)).reverse();

        return n < 0 ? -Integer.parseInt(value.toString()) : Integer.parseInt(value.toString());
    }

    public static void main(String[] args) {
        System.out.println(getReverseInteger(155));
    }
}
