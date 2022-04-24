package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode328 {


    public ListNode oddEvenList(ListNode head){
        if(head == null) return head;

        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }

//    public ListNode oddEvenList(ListNode head){
//        ListNode odd = new ListNode(-1), p1 = odd;
//        ListNode even = new ListNode(-1), p2 = even;
//
//        boolean flag = true;
//        while (head != null){
//            if(flag){
//                p1.next = head;
//                p1 = p1.next;
//                head = head.next;
//            }else{
//                p2.next = head;
//                p2 = p2.next;
//                head = head.next;
//            }
//            flag = !flag;
//        }
//        p2.next = null;
//        p1.next = even.next;
//        return odd.next;
//    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Leetcode328 l = new Leetcode328();
        l.oddEvenList(head);
    }
}
