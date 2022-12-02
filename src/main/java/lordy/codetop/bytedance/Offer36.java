package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer36 {

    class Node{
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Node head;
    public Node treeToDoublyList(Node root){
        if(root == null) return head;
        List<Node> list = new ArrayList<>();
        inorder(root, list);
        int n = list.size();
        for(int i = 0; i < n; i++){
            Node node = list.get(i);
            if(i == n - 1){
                node.right = list.get(0);
            }else {
                node.right = list.get(i + 1);
            }
        }

        for(int i = n - 1; i >= 0; i--){
            Node node = list.get(i);
            if(i == 0){
                node.left = list.get(n - 1);
            }else {
                node.left = list.get(i - 1);
            }
        }
        head = list.get(0);
        return head;
    }

    private void inorder(Node node, List<Node> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node);
        inorder(node.right, list);
    }
}
