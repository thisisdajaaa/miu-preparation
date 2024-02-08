package miu_4;

import java.util.Objects;

public class TwoSquare {
    //	Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
//	Thus 50 can be expressed as a sum of the two squares in two different ways.
//	Write a method whether or not a positive integer n can be expressed as a sum of two squares in
//	exactly two different ways.
//	The signature of the function is
//	int answerOne(int n)
    public static boolean isSquare(int n) {
        String value = Double.valueOf(Math.sqrt(n)).toString();
        String[] split = value.split("\\.");
        return Objects.equals(split[1], "0");
    }

    public static int isTwoSquare(int n) {
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (isSquare(i) && isSquare(j) && n == i + j) {
                    counter++;
                }

            }
        }


        return counter >= 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwoSquare(50));
    }
}
