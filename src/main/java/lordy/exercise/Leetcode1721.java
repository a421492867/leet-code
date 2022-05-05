package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode1721 {

    public ListNode swapNodes(ListNode head, int k){
        int n = 0;
        ListNode p = head;
        while (p != null){
            n++;
            p = p.next;
        }

        ListNode node1 = head, node2 = head;
        for(int i = 1; i < k; i++){
            node1 = node1.next;
        }
        for(int i = 1; i < n - k + 1; i++){
            node2 = node2.next;
        }

        int val1 = node1.val, val2 = node2.val;
        node1.val = val2;
        node2.val = val1;
        return head;

    }


}
