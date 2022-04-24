package lordy.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode429 {

    class Node{
        int val;
        List<Node> children;

        public Node(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                list.add(node.val);
                List<Node> children = node.children;
                if(children != null){
                    for (Node child : children){
                        queue.offer(child);
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
