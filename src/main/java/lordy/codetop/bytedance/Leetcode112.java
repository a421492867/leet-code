package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

public class Leetcode112 {

    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
