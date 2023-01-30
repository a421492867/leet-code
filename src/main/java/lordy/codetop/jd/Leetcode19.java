package lordy.codetop.jd;

import lordy.linkedlist.ListNode;

public class Leetcode19 {

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode reversed = reverse(head);
        ListNode dummy = new ListNode(-1), p = dummy;
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                p.next = reversed.next;
                break;
            }else {
                p.next = reversed;
                reversed = reversed.next;
                p = p.next;
            }
        }
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode node){
        ListNode pre = null;
        while (node != null){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
