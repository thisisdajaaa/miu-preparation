package miu_againn;

public class SumFactor {
    public static int getSumFactor(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        int occurence = 0;

        for (int j : array) {
            if (j == sum) {
                occurence++;
            }
        }

        return occurence;
    }

    public static void main(String[] args) {
        System.out.println(getSumFactor(new int[] {0, 0, 0}));
    }
}
