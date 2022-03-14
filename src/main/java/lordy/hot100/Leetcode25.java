package lordy.hot100;

import lordy.linkedlist.ListNode;

//TODO
public class Leetcode25 {

    public ListNode reverseKGroup(ListNode head, int k){
        if(head == null || head.next == null) return head;
        ListNode tail = head;
        for(int i = 0; i < k; i++){
            if(tail == null){
                return head;
            }
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    public ListNode reverse(ListNode head, ListNode tail){
        ListNode pre = null, next;
        while (head != tail){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        Leetcode25 l = new Leetcode25();
        l.reverseKGroup(head, 2);
    }
}
