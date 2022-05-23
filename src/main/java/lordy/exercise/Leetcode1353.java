package lordy.exercise;

import java.util.Arrays;

public class Leetcode1353 {

    public int maxEvents(int[][] events){
        Arrays.sort(events, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        int day = events[0][0];

        int res = 1;
        day++;
        for(int i = 1; i < events.length; i++){
            if(events[i][0] >= day){
                res++;
                day = events[i][0] + 1;
            }
            else if(events[i][1] >= day){
                res++;
                day++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] events = {{1,2},{1,2},{3,3},{1,5},{1,5}};

        Leetcode1353 l = new Leetcode1353();
        l.maxEvents(events);
    }
}
