package lordy.graph;

import java.util.*;

/**
 * No.210
 */
public class CourseSchedule2 {

    public static int[] findOrder(int numCourses, int[][] prerequisites){
        int n = prerequisites.length;
        List<Integer> res = new ArrayList<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            inDegree.put(i, 0);
        }
        for(int i = 0; i < n; i++){
            int pre = prerequisites[i][1];
            int suf = prerequisites[i][0];

            if(graph.get(pre) != null){
                graph.get(pre).add(suf);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(suf);
                graph.put(pre, list);
            }
            inDegree.put(suf, inDegree.get(suf) + 1);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(Integer key : inDegree.keySet()){
            if(inDegree.get(key) == 0){
                queue.offer(key);
            }
        }
        while (!queue.isEmpty()){
            Integer key = queue.poll();
            res.add(key);
            List<Integer> list = graph.get(key);
            if(list == null){
                continue;
            }
            for(Integer l : list){
                int curInDegree = inDegree.get(l);
                if(curInDegree - 1 == 0){
                    queue.offer(l);
                    inDegree.put(l, 0);
                }else {
                    inDegree.put(l, curInDegree - 1);
                }
            }
        }
        for(Integer key : inDegree.keySet()){
            if(inDegree.get(key) != 0){
                return new int[]{};
            }
        }
        int[] result = new int[numCourses];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int numCourse = 2;
        int[][] prerequisites = {{1,0}};
        findOrder(numCourse, prerequisites);
    }
}
