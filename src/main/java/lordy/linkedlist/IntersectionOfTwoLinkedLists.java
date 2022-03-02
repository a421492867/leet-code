package lordy.linkedlist;

import java.util.*;

/**
 * No.160
 */
public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        Set<ListNode> set = new HashSet<>();
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
