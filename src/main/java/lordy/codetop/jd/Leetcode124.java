package lordy.codetop.jd;

import lordy.tree.TreeNode;

public class Leetcode124 {

    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        helper(root);
        return res;
    }

    private int helper(TreeNode node){
        if(node == null) return 0;
        int lVal = helper(node.left);
        int rVal = helper(node.right);
        res = Math.max(lVal + node.val, res);
        res = Math.max(rVal + node.val, res);
        res = Math.max(lVal + rVal + node.val, res);
        res = Math.max(node.val, res);
        return Math.max(node.val, Math.max(lVal, rVal) + node.val);
    }
}
