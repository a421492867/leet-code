package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l1Reversed = reverse(l1);
        ListNode l2Reversed = reverse(l2);
        ListNode dummy = new ListNode(-1), p = dummy;
        int carry = 0;
        while (l1Reversed != null || l2Reversed != null){
            int val1 = l1Reversed == null ? 0 : l1Reversed.val;
            int val2 = l2Reversed == null ? 0 : l2Reversed.val;
            int num = val1 + val2 + carry;
            carry = num / 10;
            num = num % 10;
            p.next = new ListNode(num);
            p = p.next;
            l1Reversed = l1Reversed == null ? null : l1Reversed.next;
            l2Reversed = l2Reversed == null ? null : l2Reversed.next;
        }
        if(carry > 0){
            p.next = new ListNode(1);
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
