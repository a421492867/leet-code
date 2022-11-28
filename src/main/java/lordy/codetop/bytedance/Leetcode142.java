package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode142 {

    public ListNode detectCycle(ListNode head){
        if(head == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
