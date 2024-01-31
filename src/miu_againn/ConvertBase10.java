package miu_againn;

public class ConvertBase10 {
    public static int base10Converter(int[] array, int n) {
        int totalSum = 0;
        int counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                return -1;
            }

            totalSum += array[i] * (int) Math.pow(n, counter++);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(base10Converter(new int[] {1, 1, 2}, 3));
    }
}
