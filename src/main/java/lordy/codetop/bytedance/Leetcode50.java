package lordy.codetop.bytedance;

public class Leetcode50 {

    public double myPow(double x, int n){
        if(x == 0) return 0.0;
        return n > 0 ? helper(x, n) : 1 / helper(x, -(long) n);
    }

    public double helper(double x, long n){
        double res = 1.0;
        while (n > 0){
            if(n % 2 == 1){
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return res;
    }
}
