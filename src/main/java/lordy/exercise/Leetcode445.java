package lordy.exercise;

import lordy.linkedlist.ListNode;

import java.util.Stack;

public class Leetcode445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }


        int carry = 0;
        ListNode res = new ListNode(-1), p = res;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int val1 = s1.isEmpty() ? 0 : s1.pop();
            int val2 = s2.isEmpty() ? 0 : s2.pop();
            int val = val1 + val2 + carry;
            carry = val / 10;
            ListNode node = new ListNode(val % 10);
            p.next = node;
            p = p.next;
        }
        if(carry == 1){
            p.next = new ListNode(1);
        }
        return reverse(res.next);
    }

    private ListNode reverse(ListNode node){
        ListNode pre = null;
        while(node != null){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
