package miu_againn;

public class CountDigit {
    public static int getCountDigit(int digits, int num) {
        if (digits < 0 || num < 0) return -1;

        int counter = 0;
        int currentNum = digits;

        while(currentNum != 0) {
            if (currentNum % 10 == num) {
                counter++;
            }

            currentNum = currentNum / 10;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(getCountDigit(33331, 6));
    }
}
