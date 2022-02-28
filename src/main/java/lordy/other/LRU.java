package lordy.other;

import com.alibaba.fastjson.JSON;
import sun.misc.LRUCache;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * No.146
 */
public class LRU {

    private int capacity;

    private Map<Integer, Integer> map;

    private Deque<Integer> queue;


    public LRU(int capacity) {
        this.capacity = capacity;
        this.map = new ConcurrentHashMap<>();
        this.queue = new LinkedList<>();
    }

    public int get(int key){
        if(map.containsKey(key)){
            queue.remove(key);
            queue.addFirst(key);
            return map.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            map.put(key, value);
            queue.remove(key);
            queue.addFirst(key);
        }else {
            if(map.size() < capacity){
                map.put(key, value);
                queue.remove(key);
                queue.addFirst(key);
            }else {
                int lastKey = queue.removeLast();
                map.remove(lastKey);
                map.put(key, value);
                queue.addFirst(key);
            }
        }
    }

    @Override
    public String toString() {
        return "LRU{" +
                "map=" + JSON.toJSONString(map) +
                '}';
    }

    public static void main(String[] args) {
        LRU lru = new LRU(2);
        lru.put(1, 1);
        System.out.println(lru);
        lru.put(2, 2);
        System.out.println(lru);
        lru.get(1);
        lru.put(3, 3);
        System.out.println(lru);
        lru.get(2);
        lru.put(4, 4);
        System.out.println(lru);
        lru.get(1);
        lru.get(3);
        lru.get(4);
    }

}
