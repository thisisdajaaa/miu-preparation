package miu_againn;

public class MadhavArray {
    public static int isMadhavArray(int[] array) {
        int isValid = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length == i * (i + 1) / 2) {
                isValid++;
            }
        }

        if (isValid < 1) {
            return 0;
        }

        int currentTemp = array[0];
        int sum = 0;
        int count = 2;
        int indexCheck = 2;

        for (int i = 1; i < array.length; i++) {
            if (i <= indexCheck) {
                sum += array[i];
            } else {
                if (currentTemp != sum) {
                    return 0;
                }

                sum = 0;
                count = count + 1; // keeps track of the number of elements to sum in the sub array
                indexCheck = count + i - 1; // is the index up to which elements should be included in the current sum
                sum += array[i];
            }
        }
        
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[] {2, 1, 1, 4, -1, -1}));
    }
}
