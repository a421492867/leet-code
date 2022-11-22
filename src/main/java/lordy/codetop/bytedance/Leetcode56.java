package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode56 {

    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o2[1] - o1[1];
            }
            return o1[0] - o2[0];
        }));
        List<int[]> res = new ArrayList<>();
        int min = intervals[0][0];
        int max = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= max){
                min = Math.min(min, intervals[i][0]);
                max = Math.max(max, intervals[i][1]);
            }else {
                res.add(new int[]{min, max});
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        int[] last = new int[]{min, max};
        if(!res.contains(last)){
            res.add(last);
        }

        int[][] result = new int[res.size()][2];
        for(int i = 0; i < res.size(); i++){
            result[i][0] = res.get(i)[0];
            result[i][1] = res.get(i)[1];
        }


        return result;
    }

    public static void main(String[] args) {
        Leetcode56 l = new Leetcode56();

        int[][] nums = {{1,3}, {2,6}, {4, 5}, {4, 8}, {15, 18}};
        l.merge(nums);
    }


}
