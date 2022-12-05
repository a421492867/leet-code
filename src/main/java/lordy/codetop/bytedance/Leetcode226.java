package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

public class Leetcode226 {

    public TreeNode invertTree(TreeNode root){
        if(root == null) return root;
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = invertTree(root.right);
        newRoot.right = invertTree(root.left);
        return newRoot;

    }
}
