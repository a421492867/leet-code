package lordy.codetop.wangyi;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode129 {

    public int sumNumbers(TreeNode root){
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        dfs(root, root.val, list);
        int res = 0;
        for(int i : list){
            res += i;
        }
        return res;
    }

    private void dfs(TreeNode node, int num, List<Integer> list){
        if(node.left == null && node.right == null){
            list.add(num);
            return;
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
}
