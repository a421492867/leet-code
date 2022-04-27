package lordy.exercise;

import lordy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode513 {

    public int findBottomLeftValue(TreeNode root){
        if(root == null) return -1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = root.val;

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(i == 0){
                    res = node.val;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }
}
