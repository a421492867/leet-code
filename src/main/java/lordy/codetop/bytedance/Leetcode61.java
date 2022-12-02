package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode61 {

    public ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null) return head;

        int n = 1;
        ListNode node = head;
        while (node.next != null){
            node = node.next;
            n++;
        }

        ListNode pre = node;
        node.next = head;
        node = node.next;
        int rotate = k % n;

        for(int i = 0; i < n - rotate; i++){
            pre = node;
            node = node.next;
        }
        pre.next = null;
        return node;
    }
}
