package arrays;

public class Array1 {
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(3);

        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
//        singleDimensionArray.replaceItem(0, 300);
//        singleDimensionArray.traverseArray();
        System.out.println(singleDimensionArray.getItem(0));

    }
}
