package binary_tree;

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    public void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }
}
