package tree.binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }


    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public BinaryNode insertRecursive(BinaryNode currentNode, int data) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = data;
            System.out.println("Value has been inserted " + data);
            currentNode = newNode;
        } else if (data <= currentNode.value) {
            currentNode.left = insertRecursive(currentNode.left, data);
        } else {
            currentNode.right = insertRecursive(currentNode.right, data);
        }

        return currentNode;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) return;

        System.out.printf(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.printf(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.printf(node.value + " ");
    }

    public void levelOrder(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.printf(presentNode.value + " ");

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in BST");
            return null;
        }

        if (node.value == value) {
            System.out.println("Value: " + value + " found in BST");
            return node;
        }

        if (value <= node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) return root;

        return minimumNode(root.left);
    }

    public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value is not found in BST");
            return null;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode minNodeForRight = minimumNode(root.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }

        return root;
    }

    public void deleteBST() {
        root = null;
        System.out.println("BST is now deleted");
    }
}
