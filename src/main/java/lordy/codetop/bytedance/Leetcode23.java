package lordy.codetop.bytedance;

import lordy.linkedlist.ListNode;

public class Leetcode23 {

    public ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        for(int i = 0; i < lists.length; i++){
            res = merge(res, lists[i]);
        }
        return res;
    }

    public ListNode merge(ListNode listNode1, ListNode listNode2){
        if(listNode1 == null) return listNode2;
        if(listNode2 == null) return listNode1;
        ListNode res = new ListNode(-1), p = res;
        while (listNode1 != null || listNode2 != null){
            int val1 = listNode1 == null ? Integer.MAX_VALUE : listNode1.val;
            int val2 = listNode2 == null ? Integer.MAX_VALUE : listNode2.val;
            if(val1 <= val2){
                p.next = listNode1;
                listNode1 = listNode1.next;
                p = p.next;
            }else{
                p.next = listNode2;
                listNode2 = listNode2.next;
                p = p.next;
            }
        }
        return res.next;
    }
}
