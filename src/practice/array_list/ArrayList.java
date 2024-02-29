package practice.array_list;

public class ArrayList {
    int[] array = new int[5];
    int size = 0;

    public void insert(int index, int data) {
        try {
            if (array.length == size) throw new Error("Array is full!");

            array[index] = data;
            size++;

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(int index) {
        try {
            if (size == 0) throw new Error("Array is empty!");

            array[index] = 0;
            size--;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showArray() {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public int getItem(int index) {
        try {
            if (size == 0) throw new Error("Array is empty!");

            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
