package lordy.greedy.exercise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * No.452
 */
public class ArrowShots {

    public int findMinArrowShots(int[][] points){
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int pre = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(pre < points[i][0]){
                count++;
                pre = points[i][1];
            }
        }
        return count;
    }
}
