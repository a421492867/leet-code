package lordy.exercise;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode508 {

    public int[] findFrequentTreeSum(TreeNode root){
        Map<Integer, Integer> map = new HashMap<>();
        cal(root, map);
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
        int size = list.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = list.get(i);
        }
        return res;

    }

    public int cal(TreeNode node, Map<Integer, Integer> map){
        if(node == null) return 0;
        if(node.left == null && node.right == null){
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            return node.val;
        }
        int val = node.val + cal(node.left, map) + cal(node.right, map);
        map.put(val, map.getOrDefault(val, 0) + 1);
        return val;
    }

    public static void main(String[] args) {
        Leetcode508 l = new Leetcode508();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        l.findFrequentTreeSum(root);
    }
}
