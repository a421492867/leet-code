package lordy.codetop.jd;

import lordy.linkedlist.ListNode;

public class Leetcode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(-1), cur = dummy;
        while (list1 != null || list2 != null){
            int val1 = list1 == null ? Integer.MAX_VALUE : list1.val;
            int val2 = list2 == null ? Integer.MAX_VALUE : list2.val;
            if(val1 < val2){
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2 == null ? null : list2.next;
            }
        }
        return dummy.next;
    }
}
