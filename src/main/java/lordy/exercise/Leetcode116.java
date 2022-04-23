package lordy.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode116 {

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
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
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

    public static void main(String[] args) {

        Node root = new Node(1);
        Node l = new Node(2);
        Node r = new Node(3);
        Node ll = new Node(4);
        Node lr = new Node(5);
        Node rl = new Node(6);
        Node rr = new Node(7);
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        root.left = l;
        root.right = r;

        Leetcode116 leetcode116 = new Leetcode116();
        leetcode116.connect(root);
    }
}
