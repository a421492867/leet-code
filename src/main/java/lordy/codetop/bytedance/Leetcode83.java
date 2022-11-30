package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode83 {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;

        ListNode dummy = new ListNode(-1), p = dummy;
        while (head != null){
            while (head.next != null && head.val == head.next.val){
                head = head.next;
            }
            p.next = head;
            head = head.next;
            p = p.next;
        }
        return dummy.next;
    }
}
