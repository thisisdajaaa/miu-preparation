package tree.binary_tree_ll;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // PreOrder Traversal
    // root -> left subtree -> right subtree
    public void preOrder(BinaryNode node) {
        if (node == null) return;

        System.out.printf(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal
    // left subtree -> root -> right subtree
    public void inOrder(BinaryNode node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.printf(node.value + " ");
        inOrder(node.right);
    }

    // Post Order Traversal
    // left subtree -> right subtree -> root
    public void postOrder(BinaryNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.printf(node.value + " ");
    }

    // Level Order Traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");

            if (currentNode.left != null)
                queue.add(currentNode.left);


            if (currentNode.right != null)
                queue.add((currentNode.right));

        }
    }

    // Search Method
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();

            if (currentNode.value.equals(value)) {
                System.out.println("Found: " + currentNode.value);
                return;
            }

            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add((currentNode.right));
        }

        System.out.println("Not found");
    }

    // Insert method
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode current = queue.remove();

            if (current.left == null) {
                current.left = newNode;
                System.out.println("Inserted");
                return;
            } else {
                queue.add(current.left);
            }


            if (current.right == null) {
                current.right = newNode;
                System.out.println("Inserted");
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    public BinaryNode deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        BinaryNode previous, current = null;

        while (!queue.isEmpty()) {
            previous = current;
            current = queue.remove();

            if (current.left == null && previous != null) {
                BinaryNode temp = previous.right;
                previous.right = null;
                return temp;
            } else if (current.right == null) {
                BinaryNode temp = current.left;
                current.left = null;
                return temp;
            }

            queue.add(current.left);
            queue.add(current.right);
        }

        return current;
    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode current = queue.remove();

            if (current.value.equals(value)) {
                current.value = deleteDeepestNode().value;
                System.out.println("The node is deleted");
                return;
            }

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        System.out.println("The node does not exist in the BT");
    }

    public void deleteBinaryTree() {
        if (root == null) {
            System.out.println("Binary tree is empty!");
            return;
        }

        root = null;
        System.out.println("Binary tree is deleted!");
    }
}
