package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode143 {

    public void reorderList(ListNode head){
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode back = mid.next;
        mid.next = null;
        ListNode reversedBack = reverse(back);
        head = merge(head, reversedBack);
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

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode(-1), p = res;
        while (l1 != null && l2 != null){
            p.next = l1;
            l1 = l1.next;
            p = p.next;

            p.next = l2;
            l2 = l2.next;
            p = p.next;
        }
        if(l1 != null){
            p.next = l1;
        }
        if(l2 != null){
            p.next = l2;
        }
        return res.next;
    }

}
