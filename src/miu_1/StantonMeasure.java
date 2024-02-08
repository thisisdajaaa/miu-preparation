package miu_1;

public class StantonMeasure {
    public static int isStantonMeasure(int[] array) {
        int numToCheck = 1;
        int occurrence = 0;
        int counter = 0;

        while(counter < 2) {
            occurrence = 0;

            for (int j : array) {
                if (j == numToCheck) {
                    occurrence++;
                }
            }

            numToCheck = occurrence;
            counter++;
        }

        return occurrence;
    }

    public static void main(String[] args) {
        System.out.println(isStantonMeasure(new int[]  {1, 4, 3, 2, 1, 2, 3, 2} ));
    }
}

//sum of range = n * n + 1 / 2
//sum of digits = f(n / 10) + n % 10
//factorial = n * f(n - 1)
//power = n * f(n, times - 1)
//GCD = f(b, a % b)
//fibonnaci = f(n - 1) + f(n -2)
//decToBin = n % 2 + (10 * f(n / 2))