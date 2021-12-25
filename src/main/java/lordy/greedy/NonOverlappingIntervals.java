package lordy.greedy;


import java.util.Arrays;
import java.util.Comparator;

/**
 * No.435
 */
public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals){
        if(intervals.length < 2){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int count = 0;
        int pre = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(pre <= intervals[i][0]){
                pre = intervals[i][1];
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
