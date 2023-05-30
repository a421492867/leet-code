package lordy.everyday;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode1110 {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete){
        List<TreeNode> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : to_delete){
            set.add(num);
        }
        list.add(root);
        del(root, set, list);
        return list;
    }

    private TreeNode del(TreeNode node, Set<Integer> set, List<TreeNode> list){
        if(node == null) return null;
        node.left = del(node.left, set, list);
        node.right = del(node.right, set, list);
        if(set.contains(node.val)){
            if(node.left != null){
                list.add(node.left);
            }
            if(node.right != null){
                list.add(node.right);
            }
            if(list.contains(node)){
                list.remove(node);
            }
            return null;
        }
        return node;
    }
}
