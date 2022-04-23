package lordy.exercise;

import lordy.linkedlist.ListNode;

//TODO
public class Leetcode147 {

    public ListNode insertionSortList(ListNode head){
        if(head == null) return head;

        ListNode res = new ListNode(-1);
        res.next = head;

        ListNode lastSortesd = head, cur = head.next;
        while (cur != null){
            if(lastSortesd.val <= cur.val){
                lastSortesd = lastSortesd.next;
            }else {
                ListNode prev = res;
                while (prev.next.val <= cur.val){
                    prev = prev.next;
                }
                lastSortesd.next = cur.next;
                cur.next = prev.next;
                prev.next = cur;
            }
            cur = lastSortesd.next;
        }
        return res.next;
    }


}
