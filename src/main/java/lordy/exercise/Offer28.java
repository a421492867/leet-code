package lordy.exercise;

import lordy.tree.TreeNode;

public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null || l.val != r.val) return false;
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
}
