package miu_1;

public class Stacked {
    public static int isStacked(int n) {
        int currentSum = 0;
        int counter = 0;

        while (true) {
            if (currentSum > n) {
                return 0;
            }

            if (currentSum == n) {
                return 1;
            }

            counter++;
            currentSum = counter + currentSum;
        }
    }

    public static void main(String[] args) {
        System.out.println(isStacked(10));
    }
}
