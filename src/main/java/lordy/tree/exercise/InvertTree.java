package lordy.tree.exercise;

import lordy.tree.TreeNode;

/**
 * No.226
 */
public class InvertTree {

    public static TreeNode invertTree(TreeNode root){
        return helper(root);
    }

    public static TreeNode helper(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
        helper(node.left);
        helper(node.right);
        return node;
    }
}
