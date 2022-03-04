package lordy.hot100;

import lordy.linkedlist.ListNode;


public class Leetcode19 {

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode reversed = reverse(head);
        ListNode res = new ListNode(-1), l = res;
        int curNode = 0;
        while (reversed != null){
            if(curNode == n - 1){
                break;
            }else {
                l.next = reversed;
                l = l.next;
                reversed = reversed.next;
                curNode++;
            }
        }
        l.next = reversed.next;
        return reverse(res.next);
    }


    public ListNode reverse(ListNode head){
        ListNode pre = null, cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    public static void main(String[] args) {
        Leetcode19 l = new Leetcode19();
        ListNode root = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        l3.next = l4;
        l1.next = l3;
        root.next = l1;
        l.removeNthFromEnd(root, 2);
        System.out.println("---");
    }
}
