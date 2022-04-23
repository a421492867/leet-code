package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode203 {

    public ListNode removeElements(ListNode head, int val){
        ListNode res = new ListNode(-1), p = res;
        while (head != null){
            if(head.val == val){

                // 处理最后一个节点
                if(head.next != null){
                    head = head.next;
                }else{
                    head = head.next;
                    p.next = null;
                }

            }else {
                p.next = head;
                p = p.next;
                head = head.next;
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        Leetcode203 l = new Leetcode203();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        l.removeElements(head, 6);
    }
}
