package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode138 {

    static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }
    }

    Map<Node, Node> cache = new HashMap<>();
    public Node copyRandomList(Node head){


        if(head == null) return head;

        if(!cache.containsKey(head)){
            Node headNew = new Node(head.val);
            cache.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cache.get(head);
    }
}
