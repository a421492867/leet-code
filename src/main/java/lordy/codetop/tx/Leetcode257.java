package lordy.codetop.tx;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {

    public List<String> binaryTreePaths(TreeNode root){
        List<String> list = new ArrayList<>();
        String s = "";
        dfs(root, s, list);
        return list;
    }

    private void dfs(TreeNode node, String s, List<String> list){
        if(node == null) return;
        s += node.val;
        if(node.left == null && node.right == null){
            list.add(s);
        }
        dfs(node.left, s + "->", list);
        dfs(node.right, s + "->", list);
    }
}
