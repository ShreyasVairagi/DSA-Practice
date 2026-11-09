package problems;

import linkedlist.Node;

public class MiddleOfLinkedList {
    public static Node middleNode(Node head){
        if (head == null) return null;

        Node slowCurrent = head;
        Node fastCurrent = head;

        while (fastCurrent != null && fastCurrent.next != null){
            slowCurrent = slowCurrent.next;
            fastCurrent = fastCurrent.next.next;
        }

        return slowCurrent;
    }
}
