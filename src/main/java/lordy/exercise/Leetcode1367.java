package lordy.exercise;

import lordy.linkedlist.ListNode;
import lordy.tree.TreeNode;

public class Leetcode1367 {

    public boolean isSubPath(ListNode head, TreeNode root){
        if(head == null) return true;
        if(root == null) return false;
        return helper(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean helper(ListNode head, TreeNode node){
        if(head == null) return true;
        if(node == null) return false;
        if(head.val != node.val) return false;
        return helper(head.next, node.left) || helper(head.next, node.right);
    }
}
