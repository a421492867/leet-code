package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode25 {

    public ListNode reverseKGroup(ListNode head, int k){
        ListNode cur = head;
        for(int i = 0; i < k; i++){
            if(cur == null){
                return head;
            }
            cur = cur.next;
        }
        ListNode newHead = reverse(head, cur);
        head.next = reverseKGroup(cur, k);
        return newHead;
    }

    public ListNode reverse(ListNode head, ListNode tail){
        ListNode pre = null, cur = head;
        while (cur != tail){
            ListNode next = cur.next;
            cur.next = pre;
            pre =  cur;
            cur = next;
        }
        return pre;
    }
}
