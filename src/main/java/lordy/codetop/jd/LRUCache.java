package lordy.codetop.jd;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Map<Integer, Node> cache = new HashMap<>();

    private int size;

    private int capacity;

    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        Node node = cache.get(key);
        if(node == null) return -1;
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int val){
        Node node = cache.get(key);
        if(node == null){
            Node newNode = new Node(key, val);
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if(size > capacity){
                Node tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        }else {
            node.val = val;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private Node removeTail(){
        Node res = tail.prev;
        removeNode(res);
        return res;
    }
}
