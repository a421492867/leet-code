package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode230 {

    public int KthSmallest(TreeNode root, int k){
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    private void preOrder(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }
}
