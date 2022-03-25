package lordy.exercise;

import lordy.hot100.Leetcode14;
import lordy.linkedlist.ListNode;

public class Leetcode148 {
    
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        ListNode right = slow.next;
        slow.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(right);
        ListNode res = new ListNode(-1), node = res;
        while(l != null && r != null){
            if(l.val < r.val){
                node.next = l;
                l = l.next;
            }else {
                node.next = r;
                r = r.next;
            }
            node = node.next;
        }
        node.next = l != null ? l : r;
        return res.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        l3.next = l4;
        l2.next = l3;
        head.next = l2;
        Leetcode148 l = new Leetcode148();
        l.sortList(head);
    }
}
