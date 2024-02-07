package recursion;

public class getTotalProduct {
    public static int getProduct(int[] array) {
        return getTotalProductHelper(array, 0, 1);
    }

    public static int getTotalProductHelper(int[] array, int index, int product) {
        if (index > array.length - 1) return product;

        product *= array[index];

        return getTotalProductHelper(array, index + 1, product);
    }

    public static void main(String[] args) {
        System.out.println(getProduct(new int[] {1, 2, 3}));
    }
}
