package recursion;

public class SumOfOdds {
    public static int getSumOfOdds(int[] array) {
        return sumOfOddsHelper(array, 0);
    }

    public static int sumOfOddsHelper(int[] array, int start) {
        if (start > array.length - 1) return 0;

        int sum = sumOfOddsHelper(array, start + 1);

        if (array[start] % 2 != 0) sum += array[start];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfOdds(new int[] {1,2,3}));
    }
}
