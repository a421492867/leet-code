package lordy.codetop.tx;

import lordy.linkedlist.ListNode;

public class Leetcode237 {

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
