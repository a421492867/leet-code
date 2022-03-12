package lordy.hot100;

import lordy.linkedlist.ListNode;

public class Leetcode23 {

    public ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        int n = lists.length;
        if(n == 0) return res;
        for(int i = 0; i < n; i++){
            res = merge(res, lists[i]);
        }
        return res;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res = new ListNode(-1), p = res;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }else{
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }
        }
        if(l1 != null){
            p.next = l1;
        }
        if(l2 != null){
            p.next = l2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Leetcode23 l = new Leetcode23();
        ListNode[] lists = {new ListNode(2), null, new ListNode(-1)};
        l.mergeKLists(lists);
    }
}
