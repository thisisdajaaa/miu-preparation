package miu_2;

public class PLinkedList {
    public PNode head;
    public PNode tail;
    public int size;

    public void insertInitial(PNode item) {
        head = item;
        tail = item;
        head.next = null;
        size = 1;
    }

    public void add(PNode item) {
        if (head == null) {
            insertInitial(item);
            return;
        }

        if (size == 1) {
            head.next = item;
            tail = item;
            size++;
            return;
        } else {
            PNode currentNode = head;

            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = item;
            tail = item;

            System.out.println(currentNode);




            size++;
        }


    }

    public boolean find(PNode item) {
        PNode currentNode = head;

        while(currentNode.next != null) {
            if (currentNode.value == item.value) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return false;
    }

    public void print() {
        PNode currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
