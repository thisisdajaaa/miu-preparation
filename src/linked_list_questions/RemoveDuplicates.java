package linked_list_questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void apply(LinkedList linkedList) {
        Set<Integer> set = new HashSet<>();
        Node currentNode = linkedList.head;
        Node previousNode = null;

        while(currentNode != null) {
            if (set.contains(currentNode.value)) {
                previousNode.next = currentNode.next;
                linkedList.size--;
            } else {
                set.add(currentNode.value);
                previousNode = currentNode;
            }

            currentNode = currentNode.next;
        }
    }
}

// current 1 2 3 3 4 4 5
// prev 1 2 3 4 5