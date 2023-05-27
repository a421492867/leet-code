package lordy.everyday;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode1093 {

    public double[] sampleStats(int[] count){
        int n = count.length;
        //num -> count
        Map<Integer, Integer> map = new HashMap<>();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(count[i] != 0){
                map.put(i, count[i]);
                min = Math.min(i, min);
                max = Math.max(i, max);
            }
        }
        long sum = 0;
        int total = 0;
        int preMode = 0;
        double mode = 0;
        for(Integer key : map.keySet()){
            sum += (long) key * map.get(key);
            total += map.get(key);
            if(map.get(key) > preMode){
                preMode = map.get(key);
                mode = key;
            }
        }
        double mean = total == 0 ? 0 : (double) sum / total;

        int[] loc = new int[2];
        if(total % 2 == 1){
            loc[0] = total / 2 + 1;
            loc[1] = total / 2 + 1;
        }else {
            loc[0] = total / 2;
            loc[1] = total / 2 + 1;
        }
        int num1 = 0, num2 = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(cnt < loc[0] && cnt + count[i] >= loc[0]){
                num1 = i;
            }
            if(cnt < loc[1] && cnt + count[i] >= loc[1]){
                num2 = i;
            }
            cnt += count[i];
        }
        double median = (num1 + num2) / 2.0;
        double[] res = new double[5];
        res[0] = min;
        res[1] = max;
        res[2] = mean;
        res[3] = median;
        res[4] = mode;
        return res;

    }

    public static void main(String[] args) {
        Leetcode1093 l = new Leetcode1093();
        //int[] count = {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3510,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6718,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27870,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,26256,0,0,0,0,9586565,0,0,0,0,0,0,0,2333,0,0,0,0};
        l.sampleStats(count);
    }
}
