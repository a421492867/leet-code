package lordy.everyday;

import lordy.tree.TreeNode;

public class Leetcode2331 {

    public boolean evaluateTree(TreeNode root){
        if(root == null) return false;
        if(root.left == null && root.right == null) return root.val == 1;
        if(root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
