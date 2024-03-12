package linked_list_questions;

import java.util.HashMap;
import java.util.Map;

public class ReturnNthFromLast {
    public static int getNthFromLast(LinkedList list, int position) {
        Map<Integer, Node> map = new HashMap<>();
        Node currentNode = list.head;
        int index = 0;

        while (currentNode != null) {
            map.put(index, currentNode);
            currentNode = currentNode.next;
            index++;
        }

        if (map.size() < position) return 0;

        int calculatedPosition = map.size() - position;
        return map.get(calculatedPosition).value;
    }
}
