package miu_practice;

public class Fibonnaci {
//    Fibonacci Sequence:
//    The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
//
//    Here's the breakdown:
//
//    fib(0) = 0 and fib(1) = 1 (base cases).
//    For n > 1, fib(n) = fib(n-1) + fib(n-2) (recursive case).
//    And the recursive function:

    public static int getFibonnaci(int n) {
        if (n <= 1) {
            return n;
        }

        return getFibonnaci(n - 1) + getFibonnaci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFibonnaci(6));
    }
}
