package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val == subRoot.val){
            if(helper(root.left, subRoot.left) && helper(root.right, subRoot.right)){
                return true;
            }else{
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    private boolean helper(TreeNode node, TreeNode sub){
        if(node == null && sub == null) return true;
        if(node == null || sub == null) return false;
        if(node.val != sub.val) return false;
        return helper(node.left, sub.left) && helper(node.right, sub.right);
    }


}
