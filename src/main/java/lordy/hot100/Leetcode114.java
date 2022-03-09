package lordy.hot100;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode114 {

    public void flatten(TreeNode root){
        if(root == null) return;
        List<TreeNode> list = new ArrayList<TreeNode>();
        preorder(root, list);
        int size = list.size();
        for(int i = 1; i < size; i++){
            TreeNode prev = list.get(i - 1), cur = list.get(i);
            prev.left = null;
            prev.right = cur;
        }

    }

    public void preorder(TreeNode root, List<TreeNode> list){
        if(root != null){
            list.add(root);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }


}
