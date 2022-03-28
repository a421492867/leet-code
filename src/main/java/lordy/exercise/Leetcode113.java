package lordy.exercise;

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(8);
        TreeNode ll = new TreeNode(11);
        TreeNode lll = new TreeNode(7);
        TreeNode llr = new TreeNode(2);
        ll.left = lll;
        ll.right = llr;
        left.left = ll;
        root.left = left;
        TreeNode rl = new TreeNode(13);
        TreeNode rr = new TreeNode(4);
        TreeNode rrl = new TreeNode(5);
        TreeNode rrr = new TreeNode(1);
        rr.left = rrl;
        rr.right = rrr;
        right.left = rl;
        right.right = rr;
        root.right = right;
        Leetcode113 l = new Leetcode113();
        l.pathSum(root, 22);
    }
}
