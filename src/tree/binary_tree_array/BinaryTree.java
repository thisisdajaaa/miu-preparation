package tree.binary_tree_array;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size" + size + " has been created");
    }

    public boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    public void insert(String value) {
        if (isFull()) {
            System.out.println("BT is full");
            return;
        }

        arr[lastUsedIndex + 1] = value;
        lastUsedIndex++;
        System.out.println("Node " + value + " has been successfully inserted");
    }

    // Pre order
    public void preOrder(int index) {
        if (index > lastUsedIndex) return;

        System.out.print(arr[index] + " ");

        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    public void inOrder(int index) {
        if (index > lastUsedIndex) return;

        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    public void postOrder(int index) {
        if (index > lastUsedIndex) return;

        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i].equals(value)) {
                System.out.println(value + " exists at the location: " + i);
                return i;
            }

        }

        return -1;
    }

    public void deleteNode(String value) {
        int location = search(value);

        if (location == -1) return;

        arr[location] = arr[lastUsedIndex];
        lastUsedIndex--;
        System.out.println("The node is deleted successfully");
    }

    public void deleteBt() {
        try {
            arr = null;
            System.out.println("BT is now deleted");
        } catch (Exception e) {
            System.out.println("There was an error" + e);
        }
    }
}
