package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode92 {

    public ListNode reverseBetween(ListNode head, int left, int right){

        ListNode p = head;
        for(int i = 1; i < left; i++){
            p = p.next;
        }
        ListNode toBeReversed = p, temp = p;
        for(int i = 0; i < right - left; i++){
            temp = temp.next;
        }
        ListNode tail = temp.next;
        temp.next = null;
        ListNode reversed = reverse(toBeReversed);
        ListNode dummy = new ListNode(-1), cur = dummy;
        for(int i = 1; i < left; i++){
            cur.next = head;
            cur = cur.next;
            head = head.next;
        }
        cur.next = reversed;
        for(int i = 0; i <= right - left; i++){
            cur = cur.next;
        }
        cur.next = tail;
        return dummy.next;
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

    public static void main(String[] args) {
        Leetcode92 l = new Leetcode92();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        l.reverseBetween(head, 2, 4);
    }
}
