package linked_list_questions;

public class Partition {
    public static LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;

        while(currentNode != null) {
            Node tempNext = currentNode.next;

            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }

            currentNode = tempNext;
        }

        if (ll.tail != null) {
            ll.tail.next = null;
        }

        return ll;
    }
}
