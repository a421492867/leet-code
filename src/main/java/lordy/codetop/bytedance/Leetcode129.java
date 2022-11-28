package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode129 {

    public int sumNumber(TreeNode root){
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        dfs(root, root.val, list);
        int res = 0;
        for(int i : list){
            res += i;
        }
        return res;
    }

    private void dfs(TreeNode node, int val, List<Integer> list){
        if(node.left == null && node.right == null){
            list.add(val);
            return;
        }
        if(node.left != null){
            val = val * 10 + node.left.val;
            dfs(node.left, val, list);
            val = (val - node.left.val) / 10;
        }

        if(node.right != null){
            val = val * 10 + node.right.val;
            dfs(node.right, val, list);
            val = (val - node.right.val) / 10;
        }
    }
}
