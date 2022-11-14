package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.*;

public class Leetcode103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()){
            int size = stack.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = stack.poll();
                list.add(node.val);
                if(node.left != null){
                    stack.offer(node.left);
                }
                if(node.right != null){
                    stack.offer(node.right);
                }
            }
            res.add(list);
        }

        int order = 1;
        for(int i = 0; i < res.size(); i++){
            List<Integer> list = res.get(i);
            if (order <= 0) {
                Collections.reverse(list);
                res.set(i, list);
            }
            order = -order;

        }

        return res;
    }
}
