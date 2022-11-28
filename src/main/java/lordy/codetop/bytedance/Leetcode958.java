package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode958 {

    public boolean isCompleteTree(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(flag && cur != null){
                return false;
            }
            if(cur == null){
                flag = true;
                continue;
            }
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return true;

    }
}
