package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode148 {

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tail = slow.next;
        slow.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(tail);

        ListNode res = new ListNode(-1), p = res;
        while (l != null || r != null){
            int val1 = l == null ? Integer.MAX_VALUE : l.val;
            int val2 = r == null ? Integer.MAX_VALUE : r.val;
            if(val1 < val2){
                p.next = l;
                l = l == null ? l : l.next;
            }else{
                p.next = r;
                r = r == null ? r : r.next;
            }
            p = p.next;
        }
        return res.next;
    }
}
