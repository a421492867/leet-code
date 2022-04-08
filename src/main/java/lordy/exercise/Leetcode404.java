package lordy.exercise;

import lordy.tree.TreeNode;

//TODO
public class Leetcode404 {

    public int sumOfLeftLeaves(TreeNode root){
        return root == null ? 0 : dfs(root);
    }

    private int dfs(TreeNode node){
        int ans = 0;
        if(node.left != null){
            ans += isLeaf(node.left) ? node.left.val : dfs(node.left);
        }
        if(node.right != null && !isLeaf(node.right)){
            ans += dfs(node.right);
        }
        return ans;
    }

    private boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
