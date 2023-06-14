package lordy.everyday;

public class Leetcode1375 {

    public int numTimesAllBlue(int[] flips) {
        int n = flips.length;
        int res = 0, right = 0;
        for(int i = 0; i < n; i++){
            right = Math.max(right, flips[i]);
            if(right == i + 1){
                res++;
            }
        }
        return res;
    }
}
