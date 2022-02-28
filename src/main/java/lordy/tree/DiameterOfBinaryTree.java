package lordy.tree;

/**
 * No.543
 */
public class DiameterOfBinaryTree {

    private static int diameter = 0;
    public static int diameterOfBinaryTree(TreeNode root){
        depth(root);
        return diameter;
    }

    public static int depth(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = depth(node.left);
        int r = depth(node.right);
        diameter = Math.max(l + r, diameter);
        return Math.max(l, r) + 1;
    }
}
