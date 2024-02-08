package miu_3;

public class FancyNumber {
    //	A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
//	are 1 and any fancy number other than the first two is sum of three times previous one and two times
//	the one before that. see below
//	1,
//	1,
//	3*1 + 2*1 = 5,
//	3*5 + 2*1 = 17,
//	3*17 + 2*5 = 61
//	Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
//	otherwise it returns 0.
    public static int isFancy(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;

        int prev = 1;
        int current = 1;

        while(current < n) {
            int temp = current;
            current = 3 * current + 2 * prev;
            prev = temp;
        }

        return current == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(5));
    }
}
