package lordy.structure.stackandqueue;

/**
 * No.23
 */
public class MergeKSortedLists {

    private static class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        for(ListNode ln : lists){
            res = merge(res, ln);
        }
        return res;
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head;
        if(l1.val < l2.val){
            head = l1;
            head.next = merge(l1.next, l2);
        }else {
            head = l2;
            head.next = merge(l1, l2.next);
        }
        return head;
    }



}
