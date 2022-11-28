package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode662 {

    public int widthOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        Deque<TreeNode> queue = new LinkedList<>();

        int res = 1;
        root.val = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            res = Math.max(res, queue.getLast().val - queue.getFirst().val + 1);
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    node.left.val = 2 * node.val + 1;
                    queue.offer(node.left);
                }
                if(node.right != null){
                    node.right.val = 2 * node.val + 2;
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }
}
