package problems;

import linkedlist.Node;

public class LinkedListCycle {
    public static boolean hasCycle(Node head){
        if (head == null) return false;

        Node slowCurrent = head;
        Node fastCurrent = head;

        while (fastCurrent != null && fastCurrent.next != null){
            slowCurrent = slowCurrent.next;
            fastCurrent = fastCurrent.next.next;
            if (slowCurrent == fastCurrent){
                return true;
            }
        }

        return false;
    }
}
