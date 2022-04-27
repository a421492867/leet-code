package lordy.exercise;

import lordy.tree.TreeNode;

import java.util.*;

public class Leetcode501 {

    public int[] findMode(TreeNode root){
        Map<Integer, Integer> map = new HashMap<>();
        preorder(root, map);
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == max){
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void preorder(TreeNode node, Map<Integer, Integer> map){
        if(node == null) return;
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        preorder(node.left, map);
        preorder(node.right, map);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        Leetcode501 leetcode501 = new Leetcode501();
        leetcode501.findMode(root);
    }
}
