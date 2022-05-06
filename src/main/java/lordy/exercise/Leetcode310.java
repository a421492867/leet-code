package lordy.exercise;

import com.alibaba.fastjson.JSON;

import java.util.*;

//TODO 超时
public class Leetcode310 {



    public List<Integer> findMinHeightTrees(int n, int[][] edges){
        Map<Integer, Set<Integer>> map = new HashMap<>();

        int m = edges.length;
        if(m == 0) return new ArrayList<Integer>(){{this.add(0);}};

        for(int i = 0; i < m; i++){
            Set<Integer> list;
            if(map.containsKey(edges[i][0])){
                list = map.get(edges[i][0]);
            }else{
                list = new HashSet<>();
            }
            list.add(edges[i][1]);
            map.put(edges[i][0], list);

            Set<Integer> l;
            if(map.containsKey(edges[i][1])){
                l = map.get(edges[i][1]);
            }else{
                l = new HashSet<>();
            }
            l.add(edges[i][0]);
            map.put(edges[i][1], l);
        }


        int minHeight = Integer.MAX_VALUE;
        int curHeight = 0;
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            queue.offer(i);
            visited[i] = true;
            while (!queue.isEmpty()){
                int size = queue.size();
                for(int j = 0; j < size; j++){
                    int k = queue.poll();
                    Set<Integer> list = map.get(k);
                    for(int l : list){
                        if(!visited[l]){
                            queue.offer(l);
                            visited[l] = true;
                        }
                    }
                }
                curHeight++;

            }
            if(curHeight < minHeight){
                res = new ArrayList<>();
                res.add(i);
                minHeight = curHeight;
            }else if(curHeight == minHeight){
                res.add(i);
            }
            visited  = new boolean[n];
            curHeight = 0;

        }
        return res;
    }


    public static void main(String[] args) {
        Leetcode310 l = new Leetcode310();
        int n = 6;
        int[][] edges = {{3,0},{3,1},{3,2},{3,4},{5,4}};
        System.out.println(JSON.toJSONString(l.findMinHeightTrees(n, edges)));
    }


}
