package tree.binary_heap;

import java.util.Objects;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size];
        this.sizeOfTree = 0;
        System.out.println("Binary heap has been created");
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty");
            return null;
        }

        return arr[1];
    }

    public int sizeOfBP() {
        return sizeOfTree;
    }

    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;

        if (index <= 1) return;

        if (Objects.equals(heapType, "Min")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (Objects.equals(heapType, "Max")) {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }

        }

        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value, String typeHeap) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
    }

    public void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;

        if (sizeOfTree < left) return;

        if (Objects.equals(heapType, "Max")) {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (Objects.equals(heapType, "Min")) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }

        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBP(String heapType) {
        if (isEmpty()) return -1;

        int extractedValue = arr[1];
        arr[1] = arr[sizeOfTree];
        sizeOfTree--;
        heapifyTopToBottom(1, heapType);

        return extractedValue;
    }

    public void deleteBP() {
        arr = null;
        System.out.println("Binary heap is now deleted");
    }
}
