package practice.linked_list;

public class SingleLinkedList {
    SingleNode head;
    SingleNode tail;
    int size = 0;

    public void insert(int location, int data) {
        SingleNode node = new SingleNode(data);

        if (head == null) {
            head = node;
            tail = node;
            node.next = null;
        // head
        } else if (location == 0) {
           node.next = head;
           head = node;
        // tail
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        // insert in a specific location
        } else {
            SingleNode currentNode = head;
            int index = 0;

            // gets element before the specified location
            while(index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }

            SingleNode nextNode = currentNode.next;
            currentNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public void showLinkedList() {
        SingleNode currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.data);

            if (currentNode.next != null) {
                System.out.print(" -> ");
            }

            currentNode = currentNode.next;
        }
    }

    public void remove(int location) {
        if (head == null) throw new Error("Linked list is empty!");

        // If location is the head
        if (location == 0) {
            // Check if list is not empty
            if (size > 1) {
                head = head.next;
            } else {
                removeAll();
            }
        } else {
            SingleNode currentNode = head;
            int index = 0;

            while(index < location - 1){
                currentNode = currentNode.next;
                index++;
            }

            // Check if location == last element in list
            if (location == size - 1) {
                currentNode.next = null;
                tail = currentNode;
            } else {
                currentNode.next = currentNode.next.next;
            }
        }

        size--;
    }

    public int getItem(int location) {
        SingleNode currentNode = head;
        int index = 0;

        while(location != index) {
            currentNode = currentNode.next;
            index++;
        }

        return currentNode.data;

    }

    public void removeAll() {
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }
}
