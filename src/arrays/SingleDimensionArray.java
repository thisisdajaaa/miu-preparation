package arrays;

import java.util.Arrays;
import java.util.Optional;

public class SingleDimensionArray {
    public int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
            } else {
                System.out.println("Value has already been occupied");
            }
        } catch( ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getItem(int location) {
        int value = Integer.MIN_VALUE;
        
       try {
           value = arr[location];
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       }

       return value;
    }

    public void removeItem(int location) {
        try {
            arr[location] = Integer.MIN_VALUE;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void replaceItem(int location, int newValue) {
        try {
            arr[location] = newValue;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
