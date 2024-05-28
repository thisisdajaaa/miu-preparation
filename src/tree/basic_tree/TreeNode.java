package tree.basic_tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        StringBuilder value = new StringBuilder("  ".repeat(level) + data + "\n");

        for (TreeNode child : this.children) {
            value.append(child.print(level + 1));
        }

        return value.toString();
    }
}
