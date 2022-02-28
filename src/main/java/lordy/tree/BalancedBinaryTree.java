package lordy.tree;

/**
 * No.110
 */
public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
