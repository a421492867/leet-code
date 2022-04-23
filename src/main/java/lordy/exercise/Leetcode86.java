package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode86 {

    public ListNode partition(ListNode head, int x){
        ListNode left = new ListNode(-1), l = left;
        ListNode right = new ListNode(-1), r = right;

        while (head != null){
            if(head.val < x){
                l.next = head;
                l = l.next;
            }else{
                r.next = head;
                r = r.next;
            }
            head = head.next;
        }

        r.next = null;
        l.next = right.next;
        return left.next;
    }
}
