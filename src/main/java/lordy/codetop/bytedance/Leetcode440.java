package lordy.codetop.bytedance;

public class Leetcode440 {

    public int findKthNumber(int n, int k){
        int cur = 1;
        k--;
        while (k > 0){
            int step = getStep(cur, n);
            if(step <= k){
                k -= step;
                cur++;
            }else {
                cur = cur * 10;
                k--;
            }
        }
        return cur;
    }

    private int getStep(int cur, long n){
        int step = 0;
        long first = cur, last = cur;
        while (first <= n){
            step += Math.min(last, n) - first + 1;
            first = first * 10;
            last = last * 10 + 9;
        }
        return step;
    }
}
