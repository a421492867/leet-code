package lordy.search.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * No.257
 */
public class BinaryTreePaths {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<String> paths(TreeNode root){
        List<String> res = new ArrayList<>();
        String str = "";
        dfs(root, str, res);
        return res;
    }

    public static void dfs(TreeNode root, String str, List<String> res){
        if(root == null) return;
        str += root.val;
        if(root.left == null && root.right == null){
            res.add(str);
        }
        dfs(root.left, str + "->", res);
        dfs(root.right, str + "->", res);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode2.right = treeNode5;
        root.left = treeNode2;
        root.right = treeNode3;
        System.out.println(paths(root));
    }
}
