package recursion;

public class Occurrence {
    public static int getOccurrence(int[] array, int value) {
        return getOccurrenceHelper(array, value, 0);
    }

    public static int getOccurrenceHelper(int[] array, int value, int index) {
        if (index > array.length - 1) return 0;

        int count = getOccurrenceHelper(array, value, index + 1);

        if (array[index] == value) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOccurrence(new int[] {1, 1, 3, 4}, 1));
    }
}
