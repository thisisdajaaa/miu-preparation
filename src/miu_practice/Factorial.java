package miu_practice;

public class Factorial {
    // factorial
//    Factorial of a Number:
//    The factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n. For example, 5! = 5 x 4 x 3 x 2 x 1 = 120.
//
//    The recursive case breaks down the problem like this:
//
//    n! = n x (n-1)!
//    The base case is 0! = 1.

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
