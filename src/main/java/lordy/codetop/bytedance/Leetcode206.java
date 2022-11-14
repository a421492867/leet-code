package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode206 {

    public ListNode reverseList(ListNode head){

        ListNode pre = null, cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
