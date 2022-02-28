package lordy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * No.637
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root){
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            double sum = 0;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                TreeNode left = node.left, right = node.right;
                if(left != null){
                    queue.offer(left);
                }
                if(right != null){
                    queue.offer(right);
                }
            }
            res.add(sum / size);
        }
        return res;
    }


}
