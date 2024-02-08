package miu_1;

public class GuthrieIndex {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int getGuthrieIndex(int n) {
        int currentNum = n;
        int counter = 0;

        while(currentNum != 1) {
            if (isEven(currentNum)) {
                currentNum = currentNum / 2;
            } else {
                currentNum = currentNum * 3 + 1;
            }

            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(getGuthrieIndex(42));
    }
}
