package lordy.hot100;

import java.util.*;

public class Leetcode207 {

    public boolean canFinish(int numCourses, int[][] prerequisites){
        Map<Integer, Integer> inDegree = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            inDegree.put(i, 0);
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++){
            int suf = prerequisites[i][0];
            int pre = prerequisites[i][1];
            inDegree.put(suf, inDegree.get(suf) + 1);
            List<Integer> list;
            if(graph.containsKey(pre)){
                list = graph.get(pre);
            }else {
                list = new ArrayList<>();
            }
            list.add(suf);
            graph.put(pre, list);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(Integer key : inDegree.keySet()){
            if(inDegree.get(key) == 0){
                queue.offer(key);
            }
        }
        while (!queue.isEmpty()){
            int pre = queue.poll();
            List<Integer> list = graph.get(pre);
            if(list == null) continue;
            for(Integer i : list){
                Integer in = inDegree.get(i);
                if(in - 1 == 0){
                    queue.offer(i);
                }
                inDegree.put(i, in - 1);

            }
        }
        for(Integer key : inDegree.keySet()){
            if(inDegree.get(key) != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode207 l = new Leetcode207();
        int k = 2;
        int[][] pre = {{0,1}};
        l.canFinish(k, pre);
    }
}
