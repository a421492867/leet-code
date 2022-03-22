package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode83 {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;
        ListNode p = head;
        while (p != null){
            while (p.next != null && p.val == p.next.val){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }
}
