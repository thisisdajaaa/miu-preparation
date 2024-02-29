package practice.binary_tree;

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecursively(root, data);
    }

    public Node insertRecursively(Node currentRoot, int data) {
        if (currentRoot == null) {
            currentRoot = new Node(data);
        } else if (data < currentRoot.data) {
            currentRoot.left = insertRecursively(currentRoot.left, data);
        } else {
            currentRoot.right = insertRecursively(currentRoot.right, data);
        }

        return currentRoot;
    }

    public void showTree() {
        showTreeRecursively(root);
    }

    public void showTreeRecursively(Node currentRoot) {
        if (currentRoot != null) {
            showTreeRecursively(currentRoot.left);
            System.out.print(currentRoot.data + " ");
            showTreeRecursively(currentRoot.right);
        }
    }
}
