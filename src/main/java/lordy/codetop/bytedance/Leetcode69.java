package lordy.codetop.bytedance;

public class Leetcode69 {

    public int mySqrt(int x){
        if(x == 0) return 0;
        int l = 1, r = x, mid, sqrt;
        while (l <= r){
            mid = l + (r - l) / 2;
            sqrt = x / mid;
            if(sqrt == mid){
                return sqrt;
            }else if(sqrt > mid){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return r;
    }

}
