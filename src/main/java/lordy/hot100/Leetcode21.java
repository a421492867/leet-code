package lordy.hot100;

import lordy.linkedlist.ListNode;

public class Leetcode21 {

    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode res = new ListNode(-1), cur = res;
        while (list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;
            if(val1 < val2){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null){
            cur.next = list1;
        }
        if(list2 != null){
            cur.next = list2;
        }
        return res.next;
    }
}
