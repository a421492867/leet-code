package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode328 {

    public ListNode oddEvenList(ListNode head){
        ListNode odd = new ListNode(-1), p = odd;
        ListNode even = new ListNode(-1), q = even;
        int i = 0;
        while (head != null){
            if(i % 2 == 0){
                p.next = head;
                p = p.next;
                head = head.next;
            }else{
                q.next = head;
                q = q.next;
                head = head.next;
            }
            i++;
        }
        q.next = null;
        p.next = even.next;
        return odd.next;
    }
}
