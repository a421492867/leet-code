package lordy.linkedlist;

/**
 * No.24
 */
public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode res = new ListNode(-1);
        ListNode p = res;
       while (head != null && head.next != null){
           int cur = head.val;
           int next = head.next.val;
           ListNode pre = new ListNode(next);
           ListNode suf = new ListNode(cur);
           pre.next = suf;
           p.next = pre;
           head = head.next.next;
           p = p.next.next;
       }
       if(head != null){
           p.next = head;
       }
       return res.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        head.next = l1;
        swapPairs(head);
    }
}
