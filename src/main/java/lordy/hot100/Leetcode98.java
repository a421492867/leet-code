package lordy.hot100;

import lordy.tree.TreeNode;

import java.util.Stack;

public class Leetcode98 {

    public boolean isValidBST(TreeNode root){
        if(root == null) return false;
        Stack<Integer> stack = new Stack<>();
        inorder(root, stack);
        int pre = stack.pop();
        while (!stack.isEmpty()){
            if(stack.peek() >= pre){
                return false;
            }
            pre = stack.pop();
        }
        return true;
    }

    public void inorder(TreeNode root, Stack<Integer> stack){
        if(root == null) return;
        inorder(root.left, stack);
        stack.push(root.val);
        inorder(root.right, stack);
    }

    public static void main(String[] args) {
        Leetcode98 l = new Leetcode98();
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        l.isValidBST(root);
    }
}
