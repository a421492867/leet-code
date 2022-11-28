package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

public class Leetcode101 {

    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return helper(root.left, root.right);

    }

    public boolean helper(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null || l.val != r.val) return false;
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
}
