package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        dfs(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> list, List<List<Integer>> res){
        if(targetSum == node.val && node.left == null && node.right == null){
            list.add(node.val);
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        if(node.left != null){
            list.add(node.val);
            dfs(node.left, targetSum - node.val, list, res);
            list.remove(list.size() - 1);
        }
        if(node.right != null){
            list.add(node.val);
            dfs(node.right, targetSum - node.val, list, res);
            list.remove(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Leetcode113 l = new Leetcode113();
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode ll = new TreeNode(11);
        TreeNode lll = new TreeNode(7);
        TreeNode llr = new TreeNode(2);
        TreeNode r = new TreeNode(8);
        TreeNode rl = new TreeNode(13);
        TreeNode rr = new TreeNode(4);
        TreeNode rrl = new TreeNode(5);
        TreeNode rrr = new TreeNode(1);
        rr.left = rrl;
        rr.right = rrr;
        r.left = rl;
        r.right = rr;
        root.right = r;
        ll.left = lll;
        ll.right = llr;
        left.left = ll;
        root.left = left;
        l.pathSum(root, 22);

    }
}
