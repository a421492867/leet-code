package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

public class Leetcode543 {

    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root){
        helper(root);
        return res;
    }

    public int helper(TreeNode node){
        if (node == null) return 0;
        int l = helper(node.left);
        int r = helper(node.right);
        res = Math.max(l + r, res);
        return Math.max(l, r) + 1;
    }
}
