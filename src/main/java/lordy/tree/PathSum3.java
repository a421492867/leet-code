package lordy.tree;

/**
 * No.437
 */
public class PathSum3 {

    private static int res = 0;

    public static int pathSum(TreeNode root, int targetSum){
        return root != null ? backtrack(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum) : 0;
    }

    public static int backtrack(TreeNode node, int targetSum){
        if(node == null) return 0;
        int count = node.val == targetSum ? 1 : 0;
        count += backtrack(node.left, targetSum - node.val);
        count += backtrack(node.right, targetSum - node.val);
        return count;
    }

}
