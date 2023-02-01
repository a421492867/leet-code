package lordy.codetop.jd;

import lordy.linkedlist.ListNode;

public class Leetcode23 {

    public ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        for(ListNode node : lists){
            res = merge(res, node);
        }
        return res;
    }

    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode res = new ListNode(-1), p = res;
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
        return res.next;
    }
}
