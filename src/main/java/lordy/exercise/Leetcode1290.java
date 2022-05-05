package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode1290 {

    public int getDecimalValue(ListNode head){
        ListNode node = reverse(head);
        int res = 0;
        int sqrt = 0;
        while (node != null){
            res += node.val * Math.pow(2, sqrt);
            node = node.next;
            sqrt += 1;
        }
        return res;

    }

    public ListNode reverse(ListNode node){
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
