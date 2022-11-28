package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1), p = dummy;
        int flag = 0;
        while (l1 != null || l2 != null){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = val1 + val2 + flag;
            if(val >= 10){
                val = val % 10;
                flag = 1;
            }else {
                flag = 0;
            }
            p.next = new ListNode(val);
            p = p.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(flag > 0){
            p.next = new ListNode(1);
        }
        return dummy.next;

    }

}
