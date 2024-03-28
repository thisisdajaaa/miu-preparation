package linked_list_questions;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static Node getIntersection(LinkedList l1, LinkedList l2) {
        List<Node> listL1 = new ArrayList<>();
        List<Node> listL2 = new ArrayList<>();

        Node currentL1Node = l1.head;
        Node currentL2Node = l2.head;

        while (currentL1Node != null) {
            listL1.add(currentL1Node);
            currentL1Node = currentL1Node.next;
        }

        while (currentL2Node != null) {
            listL2.add(currentL2Node);
            currentL2Node = currentL2Node.next;
        }

        for (Node node1 : listL1) {
            for (Node node2 : listL2) {
                if (node1 == node2) return node2;
            }
        }

        return null;
    }
}
