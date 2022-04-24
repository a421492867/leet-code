package lordy.exercise;

import lordy.tree.TreeNode;

public class Leetcode222 {

    private int res = 0;

    public int countNodes(TreeNode root){
        dfs(root);
        return res;
    }


    private void dfs(TreeNode node){
        if(node == null) return;
        res += 1;
        dfs(node.left);
        dfs(node.right);
    }
}
