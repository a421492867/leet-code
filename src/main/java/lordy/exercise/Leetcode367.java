package lordy.exercise;

public class Leetcode367 {

    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while (l <= r){
            int mid = l + (r - l) / 2;
            long q = (long) mid * mid;
            if(q > num){
                r = mid - 1;
            }else if(q < num){
                l = mid + 1;
            }else {
                return true;
            }
        }
        return false;

    }
}
