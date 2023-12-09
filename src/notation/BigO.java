package notation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigO {
    public static int[] getSumAndProd(int[] data) {
        int sum = 0;
        int product = 1;

        for (int datum : data) {
            sum += datum;
            product *= datum;
        }

        return new int[]{sum, product};
    }

    public static List<String> getArrayPairs(int[] data) {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = i + 1; j < data.length; j++) {
                row.append(Integer.toString(data[i])).append(Integer.toString(data[j])).append(" ");

            }

            String formattedString = String.join(", ", row.toString().split(" "));
            items.add(formattedString);
        }

        return items;
    }

    public static void main(String[] args) {
        int[] sample = new int[] {1, 3, 4};

        System.out.println(getArrayPairs(sample));

    }
}
