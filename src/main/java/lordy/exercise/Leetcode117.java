package lordy.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode117 {

    static class Node{
        int val;
        Node left;
        Node right;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public Node connect(Node root){
        if(root == null) return root;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            int size  = queue.size();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                if(i < size - 1){
                    node.next = queue.peek();
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }
}
