package miu_1;

public class AnotherBalanced {
    public static boolean isEven(int n) { return n % 2 == 0; }

    public static int isAnotherBalanced(int[] array) {
        if (array.length == 0) return 0;
        
        boolean isFirstNumberEven = isEven(array[0]);

        for (int i = 0; i < array.length; i++) {
            // Even
            if (isFirstNumberEven) {
                if (isEven(i) && !isEven(array[i]) || !isEven(i) && isEven(array[i])) {
                    return 0;
                }
            // Odd
            } else {
                if (isEven(i) && isEven(array[i]) || !isEven(i) && !isEven(array[i])) {
                    return 0;
                }
            }
        }
        
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAnotherBalanced(new int[] {2, 3, 6, 7}));
    }
}
