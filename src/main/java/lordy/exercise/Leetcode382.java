package lordy.exercise;

import lordy.linkedlist.ListNode;

import java.util.Random;

public class Leetcode382 {

    ListNode head;
    Random random;

    public Leetcode382(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom(){
        int i = 1, ans = 0;
        ListNode node = this.head;
        while (node != null){
            if(random.nextInt(i) == 0){
                ans = node.val;
            }
            i += 1;
            node = node.next;
        }
        return ans;
    }
}
