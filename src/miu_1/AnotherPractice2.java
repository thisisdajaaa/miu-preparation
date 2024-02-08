package miu_1;

public class AnotherPractice2 {
    public static int getDifferenceOfEvenAndOdd(int [] array) {
        int totalEvenSum = 0;
        int totalOddSum = 0;

        for (int i = 0; i < array.length; i++) {
            // EVEN
            if (array[i] % 2 == 0) {
                totalEvenSum += array[i];
            // ODD
            } else {
                totalOddSum += array[i];
            }
        }

        return totalOddSum - totalEvenSum;
    }

    public static void main(String[] args) {
        System.out.println(getDifferenceOfEvenAndOdd(new int[] {1, 2}));
    }
}
