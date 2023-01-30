package lordy.codetop.jd;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {


    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
