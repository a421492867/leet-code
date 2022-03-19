package lordy.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode56 {

    public int[][] merge(int[][] intervals){
        int n = intervals.length;
        if(n <= 1) return intervals;
        Arrays.sort(intervals, (o1, o2) ->{
            if(o1[0] == o2[0]){
                return o2[1] - o1[1];
            }else{
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        int curMin = intervals[0][0];
        int curMax = intervals[0][1];
        for(int i = 1; i < n; i++){
            if(curMax >= intervals[i][0]){
                curMin = Math.min(intervals[i][0], curMin);
                curMax = Math.max(intervals[i][1], curMax);
            }else {
                list.add(new int[]{curMin, curMax});
                curMin = intervals[i][0];
                curMax = intervals[i][1];
            }
        }
        if(!list.contains(new int[]{curMin, curMax})){
            list.add(new int[]{curMin, curMax});
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode56 l = new Leetcode56();
        int[][] intervals = {{1,3}, {2,6},{8,10},{15,18}};
        l.merge(intervals);
    }
}
