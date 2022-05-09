package lordy.exercise;

import lordy.linkedlist.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1171 {

    public ListNode removeZeroSumSublists(ListNode head){
        if(head == null || head.next == null){
            return head != null && head.val == 0 ? null : head;
        }



        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        int sum = 0;
        while(p != null){
            sum += p.val;
            if(map.containsKey(sum)){
                ListNode node = map.get(sum);
                node = node.next;
                while(node != p){
                    map.remove(node.val + sum);
                    node = node.next;

                }
                map.get(sum).next = p.next;
            }else{
                map.put(sum, p);
            }

            p = p.next;
        }
        return dummy.next;

    }


    public static void main(String[] args) {
        Leetcode1171 l = new Leetcode1171();
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(-2);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(-5);
        head.next.next.next.next.next.next.next.next = new ListNode(1);

        l.removeZeroSumSublists(head);

    }
}
