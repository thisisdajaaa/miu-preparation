package miu_5;

public class HighestExponent {
//    The function findHighestExponent returns the highest exponent x such that p^x is a factor of n.
//    The function takes two arguments: n, the number to be factored, and p, the base of the exponent.
//    The function returns the value of x. If p is less than or equal to 1, the function returns 0, as exponents for these bases are not valid for this calculation.

    public static int findHighestExponent(int n, int p) {
        if (p <= 1) {
            return 0;
        }

        int exponent = 0;
        while (n % Math.pow(p, exponent) == 0) {
            exponent++;
        }

        // Subtract 1 because the loop exits when n is no longer divisible by p^exponent
        return exponent - 1;
    }

    public static void main(String[] args) {
        System.out.println(findHighestExponent(162, 3));
    }

}
