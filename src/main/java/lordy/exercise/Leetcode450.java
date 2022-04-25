package lordy.exercise;

import lordy.tree.TreeNode;

public class Leetcode450 {


    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null) return null;
        if(key > root.val) root.right = deleteNode(root.right, key);
        else if(key < root.val) root.left = deleteNode(root.left, key);
        else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode node = root.right;
            while (node.left != null){
                node = node.left;
            }
            node.left = root.left;
            root = root.right;
        }
        return root;

    }



}
