package problems;

import linkedlist.Node;

public class MergeTwoSortedLists {
    public static Node mergeTwoLists(Node list1, Node list2){
        Node ans = new Node(0);
        Node head = ans;
        Node head1 = list1;
        Node head2 = list2;

        while (head1 != null && head2 != null){
            if (head1.data < head2.data){
                ans.next = head1;
                head1 = head1.next;
            }
            else {
                ans.next = head2;
                head2 = head2.next;
            }
            ans = ans.next;
        }

        if (head1 != null) {
            ans.next = head1;
        } else {
            ans.next = head2;
        }

        return head.next;
    }
}
