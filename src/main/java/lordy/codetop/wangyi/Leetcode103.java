package lordy.codetop.wangyi;

import lordy.tree.TreeNode;

import java.util.*;

public class Leetcode103 {

    public List<List<Integer>> zigzagLevevOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }

        int order = 1;
        for(int i = 0; i < res.size(); i++){
            List<Integer> list = res.get(i);
            if(order < 0){
                Collections.reverse(list);
                res.set(i, list);
            }
            order = -order;
        }
        return res;
    }
}
