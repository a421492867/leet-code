package lordy.hot100;

import lordy.linkedlist.ListNode;

public class Leetcode92 {


    public ListNode reverseBetween(ListNode head, int left, int right){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        for(int i = 0; i < left - 1; i++){
            p = p.next;
        }

        ListNode from = p.next, temp = from;
        for(int i = left; i < right; i++){
            temp = temp.next;
        }
        ListNode tail = temp.next;

        temp.next = null;
        ListNode reversed = reverse(from);

        p.next = reversed;
        while (true){
            if(p.next == null){
                p.next = tail;
                break;
            }else {
                p = p.next;
            }
        }
        return dummy.next;

    }

    public ListNode reverse(ListNode listNode){
        ListNode pre = null;
        while(listNode != null){
            ListNode next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;
        }
        return pre;
    }
}
