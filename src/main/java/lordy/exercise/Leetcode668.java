package lordy.exercise;

public class Leetcode668 {

    public int findKthNumber(int m, int n, int k){
        int l = 1, r = m * n;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(func(mid, m, n, k)) r = mid;
            else l = mid + 1;
        }

        return l;
    }

    public boolean func(int cur, int m, int n, int k){
        int count = 0;
        for(int i = 1; i <= m; i++){
            count += Math.min(cur / i, n);
        }
        return count >= k;
    }

}
