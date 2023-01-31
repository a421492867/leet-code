package lordy.codetop.tx;

import lordy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode234 {

    public boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int l = 0, r = list.size() - 1;
        while (l < r){
            if(list.get(l) != list.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
