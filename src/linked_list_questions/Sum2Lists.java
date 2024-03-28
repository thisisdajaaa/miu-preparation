package linked_list_questions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Sum2Lists {
    public static LinkedList sumTwoLists(LinkedList l1, LinkedList l2) {
        StringBuilder list1Value = new StringBuilder();
        StringBuilder list2Value = new StringBuilder();

        Node currentL1Node = l1.head;

        while (currentL1Node != null) {
            list1Value.append(currentL1Node.value);
            currentL1Node = currentL1Node.next;
        }

        Node currentL2Node = l2.head;

        while (currentL2Node != null) {
            list2Value.append(currentL2Node.value);
            currentL2Node = currentL2Node.next;
        }

        BigInteger formattedList1Value = new BigInteger(String.valueOf(list1Value.reverse()));
        BigInteger formattedList2Value = new BigInteger(String.valueOf(list2Value.reverse()));
        BigInteger total = formattedList1Value.add(formattedList2Value);

        List<String> totalSplit = Arrays.stream((new StringBuilder(String.valueOf(total)).reverse()).toString().split("")).toList();

        LinkedList newList = new LinkedList();

        totalSplit.forEach(item -> {
            newList.insertNode(Integer.parseInt(item));
        });

        return newList;
    }
}
