package lordy.codetop.jd;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        dfs(root, targetSum - root.val, res, list);
        return res;
    }

    private void dfs(TreeNode node, int sum, List<List<Integer>> res, List<Integer> list){
        if(node.left == null && node.right == null && sum == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(node.left != null){
            list.add(node.left.val);
            dfs(node.left, sum - node.left.val, res, list);
            list.remove(list.size() - 1);
        }
        if(node.right != null){
            list.add(node.right.val);
            dfs(node.right, sum - node.right.val, res, list);
            list.remove(list.size() - 1);
        }
    }
}
