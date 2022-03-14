package lordy.hot100;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode230 {

    public int kthSmallest(TreeNode root, int k){
        if(root == null) return -1;
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    public void preorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}
