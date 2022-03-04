package lordy.hot100;

import lordy.linkedlist.ListNode;

public class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = new ListNode(-1), pre = res;
        boolean flag = false;
        while (l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                int num = flag ? l1.val + l2.val + 1 : l1.val + l2.val;
                flag = false;
                if(num >= 10){
                    pre.next = new ListNode(num - 10);
                    flag = true;
                }else {
                    pre.next = new ListNode(num);
                }
                l1 = l1.next;
                l2 = l2.next;
                pre = pre.next;
            }else if(l1 != null){
                int num = flag ? l1.val + 1 : l1.val;
                flag = false;
                if(num >= 10){
                    pre.next = new ListNode(num - 10);
                    flag = true;
                }else {
                    pre.next = new ListNode(num);
                }
                l1 = l1.next;
                pre = pre.next;
            }else {
                int num = flag ? l2.val + 1 : l2.val;
                flag = false;
                if(num >= 10){
                    pre.next = new ListNode(num - 10);
                    flag = true;
                }else {
                    pre.next = new ListNode(num);
                }
                l2 = l2.next;
                pre = pre.next;
            }
        }

        if(flag){
            pre.next = new ListNode(1);
        }
        return res.next;
    }
}
