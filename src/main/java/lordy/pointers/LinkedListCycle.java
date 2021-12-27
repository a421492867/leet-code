package lordy.pointers;

/**
 * No.142
 */
public class LinkedListCycle {

    public static ListNode detectCycle(ListNode head){
       ListNode fast = head, slow = head;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(fast == slow){
               fast = head;
               while (fast != slow){
                   fast = fast.next;
                   slow = slow.next;
               }
               return fast;
           }
       }
       return null;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(-4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l1;
        System.out.println(detectCycle(head).val);
    }
}
