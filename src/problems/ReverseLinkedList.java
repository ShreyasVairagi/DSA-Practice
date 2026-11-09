package problems;

import linkedlist.Node;

public class ReverseLinkedList {
    public static Node reverseList(Node head){
        if (head == null || head.next == null) { return head; }

        Node prev = null;
        Node current = head;

        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
