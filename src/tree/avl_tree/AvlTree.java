package tree.avl_tree;

import java.util.LinkedList;
import java.util.Queue;

public class AvlTree {
    public BinaryNode root;

    public AvlTree() {
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
    public void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();

            if (currentNode.value == value) {
                System.out.println("Found: " + currentNode.value);
                return;
            }

            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add((currentNode.right));
        }

        System.out.println("Not found");
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

    public void deleteBinaryTree() {
        if (root == null) {
            System.out.println("Binary tree is empty!");
            return;
        }

        root = null;
        System.out.println("Binary tree is deleted!");
    }

    public int getHeight(BinaryNode node) {
        if (node == null) return 0;

        return node.height;
    }

    // rotateRight
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // rotateLeft
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // getBalance
    public int getBalance(BinaryNode node) {
        if (node == null) return 0;

        return getHeight(node.left) - getHeight(node.right);
    }

    // insertNode method
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        // left-left condition
        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);
        }

        // left-right condition
        if (balance > 1 && nodeValue > node.left.right.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // right-right condition
        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }

        // right-left condition
        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    // Minimum node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) return root;

        return minimumNode(root.left);
    }

    // Delete Node
    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("value not found in AVL");
            return node;
        }

        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }

        int balance = getBalance(node);

        // left-left rotation
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }

        // left-right rotation
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // right-right rotation
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }

        // right-left rotation
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }
}
