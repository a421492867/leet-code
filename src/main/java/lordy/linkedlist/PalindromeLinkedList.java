package lordy.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * No.234
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int pre = 0, last = list.size() - 1;
        while (pre < last){
            if(!list.get(pre).equals(list.get(last))){
                return false;
            }
            pre++;
            last--;
        }
        return true;
    }


}
