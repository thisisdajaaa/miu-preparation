package miu_againn;

public class FactorTwoCount {
    public static int getFactorTwoCount(int n) {
        int count = 0;
        int currentNum = n;

        while(currentNum % 2 == 0) {
            currentNum /= 2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getFactorTwoCount(48));
    }
}
