package lordy.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * No.144
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        preorder(root, res);
        return res;
    }

    public static void preorder(TreeNode node, List<Integer> res){
        if(node == null) return;
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }

    public static List<Integer> preorderWithoutRecursive(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return res;
    }


}
