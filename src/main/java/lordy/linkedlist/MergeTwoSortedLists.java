package lordy.linkedlist;

/**
 * No.21
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        list1.next = a;
        a.next = b;

        ListNode list2 = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        c.next = d;
        list2.next = c;
        mergeTwoLists(list1, list2);
    }
}
