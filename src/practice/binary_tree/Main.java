package practice.binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(12);
        tree.insert(20);

        tree.showTree();
    }
}
