package lordy.everyday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1090 {

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit){
        int n = values.length;
        int[][] array = new int[n][2];
        for(int i = 0; i < n; i++){
            array[i][0] = values[i];
            array[i][1] = labels[i];
        }

        Arrays.sort(array, (o1, o2) -> o2[0] - o1[0]);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int res = 0;
        while (numWanted > 0 && index < n){
            int[] cur = array[index];
            if(!map.containsKey(cur[1])){
                res += cur[0];
                map.put(cur[1], 1);
                numWanted--;
            }else{
                if(map.get(cur[1]) < useLimit){
                    res += cur[0];
                    map.put(cur[1], map.get(cur[1]) + 1);
                    numWanted--;
                }
            }
            index++;

        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Leetcode1090 l = new Leetcode1090();
        int[] values = {5,4,3,2,1};
        int[] labels = {1,1,2,2,3};
        l.largestValsFromLabels(values, labels, 3, 1);
    }
}
