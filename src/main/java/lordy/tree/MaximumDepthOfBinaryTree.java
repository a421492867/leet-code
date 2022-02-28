package lordy.tree;

import java.util.Map;

/**
 * No.104
 */
public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }



}
