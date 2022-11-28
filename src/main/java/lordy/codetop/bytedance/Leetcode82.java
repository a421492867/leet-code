package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;


public class Leetcode82 {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;
        ListNode p =head, pre = head;
        while (p != null){
            ListNode cur = p;
            while (p.next != null && p.val == p.next.val){
                p = p.next;
            }
            if(cur == p){
                pre = p;
                p = p.next;
            }else {
                if(cur == head){
                    pre = p.next;
                    head = p.next;
                    p = p.next;
                }else {
                    pre.next = p.next;
                    p = p.next;
                }
            }
        }
        return head;
    }
}
