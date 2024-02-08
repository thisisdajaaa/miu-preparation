package miu_1;

public class Hollow {
    public static int isHollow(int[] array) {
        int zeroCount = 0;
        int nonZeroCountBefore = 0;
        int nonZeroCountAfter = 0;
        boolean zeroSequenceStarted = false;
        boolean zeroSequenceEnded = false;

        // First pass to count zeros and ensure they're contiguous
        for (int value : array) {
            if (value == 0) {
                zeroCount++;
                zeroSequenceStarted = true;
                if (zeroSequenceEnded) {
                    // Found a zero after non-zero elements, sequence not contiguous
                    return 0;
                }
            } else if (zeroSequenceStarted) {
                zeroSequenceEnded = true; // Found non-zero after zero, ending zero sequence
            }
        }

        if (zeroCount < 3) {
            return 0; // Less than 3 zeros is not hollow
        }

        // Second pass to count non-zero elements before the zero sequence
        for (int j : array) {
            if (j == 0) {
                break;
            }
            nonZeroCountBefore++;
        }

        // Third pass to count non-zero elements after the zero sequence
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                break;
            }
            nonZeroCountAfter++;
        }

        // Check if the non-zero counts before and after the zero sequence are equal
        return nonZeroCountBefore == nonZeroCountAfter ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5})); // Should return 1
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));          // Should return 0
    }
}
