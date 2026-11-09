package problems;

import linkedlist.Node;

public class IntersectionOfTwoLinkedLists {
    public static Node getIntersectionNode(Node headA, Node headB){
        Node list1 = headA;
        Node list2 = headB;

        while (list1 != list2){
            list1 = list1.next;
            list2 = list2.next;
            if (list1 == null){
                list1 = headB;
            }
            if (list2 == null){
                list2 = headA;
            }
        }

        return list1;
    }

}
