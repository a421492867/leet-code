package lordy.exercise;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import lordy.tree.TreeNode;

public class Leetcode124 {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        helper(root);
        return max;
    }

    public int helper(TreeNode root){
        if(root == null) return 0;
        int leftVal = helper(root.left);
        int rightVal = helper(root.right);
        max = Math.max(leftVal + root.val, max);
        max = Math.max(rightVal + root.val, max);
        max = Math.max(leftVal + root.val + rightVal, max);
        max = Math.max(root.val, max);
        return Math.max(root.val, root.val + Math.max(leftVal, rightVal));
    }
}
