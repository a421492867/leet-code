package lordy.codetop.bytedance;

import lordy.tree.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode98 {

    public boolean isValidBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) <= list.get(i - 1)){
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        if(node.left != null){
            inorder(node.left, list);
        }
        list.add(node.val);
        if(node.right != null){
            inorder(node.right, list);
        }
    }
}
