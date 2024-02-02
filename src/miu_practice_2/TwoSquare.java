package miu_practice_2;

import java.util.HashMap;
import java.util.Map;

public class TwoSquare {
    //	Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
//	Thus 50 can be expressed as a sum of the two squares in two different ways.
//	Write a method whether or not a positive integer n can be expressed as a sum of two squares in
//	exactly two different ways.
//	The signature of the function is
//	int answerOne(int n)

    public static int isTwoSquare(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count == 2) break;
                
                if ((int) Math.pow(i, 2) + (int) Math.pow(j, 2) == n) {
                    count++;
                }
            }
        }

        return count == 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwoSquare(50));
    }


}
