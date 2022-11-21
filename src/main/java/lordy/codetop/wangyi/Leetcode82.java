package lordy.codetop.wangyi;

import lordy.linkedlist.ListNode;

public class Leetcode82 {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;
        ListNode p = head, pre = head;
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

    public static void main(String[] args) {
        Leetcode82 l = new Leetcode82();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        ListNode res = l.deleteDuplicates(head);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
