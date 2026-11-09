package problems;

import linkedlist.Node;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head){
        Node fastNode = head;
        Node slowNode = head;

        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        Node reversedHead = null;
        Node current = slowNode;

        while (current != null){
            Node next = current.next;
            current.next = reversedHead;
            reversedHead = current;
            current = next;
        }

        Node firstHalf = head;
        Node secondHalf = reversedHead;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
