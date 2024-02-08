package miu_1;

public class SmartNumber {
    public static int isSmartNumber(int n) {
        int counter = 1;
        int currentNumber = 1;

        while(true) {
            if (currentNumber > n) return 0;
            if (currentNumber == n) return 1;

            currentNumber = currentNumber + counter;
            counter++;
        }
    }

    public static void main(String[] args) {
        System.out.println(isSmartNumber(4));
    }
}
