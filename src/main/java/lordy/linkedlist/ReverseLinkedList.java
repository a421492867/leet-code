package lordy.linkedlist;

/**
 * No.206
 */
public class ReverseLinkedList {


    public static ListNode reverseList(ListNode head){
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

    }
}
