package lordy.exercise;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode129 {

    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, root.val, list);
        int res = 0;
        for(int i : list){
            res += i;
        }
        return res;

    }

    public void dfs(TreeNode node, int num, List<Integer> list){
        if(node.left == null && node.right == null){
            list.add(num);
        }
        if(node.left != null){
            num = num * 10 + node.left.val;
            dfs(node.left, num, list);
            num = (num - node.left.val) / 10;
        }
        if(node.right != null){
            num = num * 10 + node.right.val;
            dfs(node.right, num, list);
            num = (num - node.right.val) / 10;

        }
    }

    public static void main(String[] args) {
        Leetcode129 l = new Leetcode129();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        l.sumNumbers(root);
    }
}
