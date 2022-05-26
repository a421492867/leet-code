package lordy.exercise;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode1353 {



    public int maxEvents(int[][] events){

        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int n = events.length;
        int i = 0;
        int day = 1;
        int ans = 0;
        while (i < n || !pq.isEmpty()){
            while (i < n && events[i][0] == day){
                int[] event = events[i];
                pq.offer(event);
                i++;
            }
            if(pq.isEmpty()){
                day++;
                continue;
            }
            while (!pq.isEmpty() && pq.peek()[1] < day){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                ans++;
            }
            day++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] events = {{1,2},{1,2},{3,3},{1,5},{1,5}};

        Leetcode1353 l = new Leetcode1353();
        l.maxEvents(events);
    }
}
