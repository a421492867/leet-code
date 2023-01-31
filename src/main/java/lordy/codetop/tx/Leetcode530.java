package lordy.codetop.tx;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode530 {

    public int getMinimumDifference(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
            res = Math.min(res, Math.abs(list.get(i) - list.get(i - 1)));
        }
        return res;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
