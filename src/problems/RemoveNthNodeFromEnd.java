package problems;

import linkedlist.Node;

public class RemoveNthNodeFromEnd {
    public static Node removeNthFromEnd(Node head, int n){
        if (head == null) {
            return null;
        }

        int count = 0;
        Node fastNode = head;
        Node slowNode = head;

        while (count < n){
            if (fastNode == null) {
                return head;
            }
            fastNode = fastNode.next;
            count++;
        }

        if (fastNode == null) {
            return head.next;
        }

        while (fastNode.next != null){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        slowNode.next = slowNode.next.next;

        return head;
    }
}
