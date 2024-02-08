package miu_1;

public class FactorEqual {
    public static int isFactorEqual(int num1, int num2) {
        int totalNum1Factors = 0, totalNum2Factors = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) totalNum1Factors++;
        }

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) totalNum2Factors++;
        }
        
        return totalNum1Factors == totalNum2Factors ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFactorEqual(10, 33));
    }
}
