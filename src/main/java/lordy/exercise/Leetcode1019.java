package lordy.exercise;

import lordy.linkedlist.ListNode;

public class Leetcode1019 {

    public int[] nextLargerNodes(ListNode head){

        ListNode p = head;
        int n = 0;
        while(p != null){
            n++;
            p = p.next;
        }


        int[] res = new int[n];
        int index = 0;
        for(ListNode i = head; i != null; i = i.next){
            int result = 0;
            for(ListNode j = i.next; j != null; j = j.next){
                if(j.val > i.val){
                    result = j.val;
                    break;
                }
            }
            res[index++] = result;
        }

        return res;
    }
}
