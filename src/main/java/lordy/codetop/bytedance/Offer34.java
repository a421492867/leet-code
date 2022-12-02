package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer34 {

    public List<List<Integer>> pathSum(TreeNode root, int target){

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        dfs(root, target - root.val, list, res);
        return res;
    }

    private void dfs(TreeNode node, int target, List<Integer> list, List<List<Integer>> res){
        if(node.left == null && node.right == null && target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(node.left != null){
            list.add(node.left.val);
            dfs(node.left, target - node.left.val, list, res);
            list.remove(list.size() - 1);
        }
        if(node.right != null){
            list.add(node.right.val);
            dfs(node.right, target - node.right.val, list, res);
            list.remove(list.size() - 1);
        }
    }
}
