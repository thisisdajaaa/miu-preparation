package tree.binary_heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        binaryHeap.insert(10, "Min");
        binaryHeap.insert(5, "Min");
        binaryHeap.insert(15, "Min");
        binaryHeap.insert(1, "Min");
        binaryHeap.levelOrder();
        binaryHeap.extractHeadOfBP("Min");
        binaryHeap.levelOrder();
        binaryHeap.deleteBP();
    }
}
