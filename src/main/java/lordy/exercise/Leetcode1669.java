package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode p = list1;
        for(int i = 0; i < a - 1; i++){
            p = p.next;
        }
        ListNode next = p.next;
        p.next = list2;
        for(int i = 0; i < b - a; i++){
            next = next.next;
        }
        ListNode tail = next.next;
        while (p.next != null){
            p = p.next;
        }
        p.next = tail;
        return list1;

    }
}
