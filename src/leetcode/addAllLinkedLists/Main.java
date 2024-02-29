package leetcode.addAllLinkedLists;

import java.math.BigInteger;

public class Main {
    public static ListNode createListFromArray(String[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(Integer.parseInt(values[0])); // Create head node
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(Integer.parseInt(values[i])); // Create and link new node
            current = current.next; // Move current to the new node
        }

        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder value1 = new StringBuilder();
        StringBuilder value2 = new StringBuilder();

        while (l1 != null) {
            value1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            value2.append(l2.val);
            l2 = l2.next;
        }

        value1.reverse();
        value2.reverse();

        BigInteger parsedValue1 = new BigInteger(value1.toString());
        BigInteger parsedValue2 = new BigInteger(value2.toString());

        BigInteger sum = parsedValue1.add(parsedValue2);

        System.out.println(parsedValue2);

        String[] splitted = new StringBuilder(sum.toString()).reverse().toString().split("");

        ListNode listNode = new ListNode(Integer.parseInt(splitted[0]));
        ListNode currentNode = listNode;

        int index = 1;

        while(index < splitted.length) {
            currentNode.next = new ListNode(Integer.parseInt(splitted[index++]));
            currentNode = currentNode.next;
        }

        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = createListFromArray(new String[]{"9"});

        ListNode listNode2 = createListFromArray(new String[]{"1", "9", "9", "9", "9", "9", "9", "9", "9", "9"});

        System.out.println(addTwoNumbers(listNode1, listNode2));

        int gg = 1999999999;
    }
}
