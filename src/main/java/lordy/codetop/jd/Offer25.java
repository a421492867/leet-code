package lordy.codetop.jd;

import lordy.linkedlist.ListNode;

public class Offer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1),  p = dummy;
        while (l1 != null || l2 != null){
            int val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
            int val2 = l2 == null ? Integer.MAX_VALUE : l2.val;
            if(val1 <= val2){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else{
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }

        return dummy.next;
    }
}
