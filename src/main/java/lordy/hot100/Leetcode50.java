package lordy.hot100;

public class Leetcode50 {

    public double myPow(double x, int n){
        if(x == 0.0) return x;
        return n < 0 ? 1 / fastPow(x, -(long) n) : fastPow(x, n);
    }

    public double fastPow(double x, long n){
        double res = 1.0;
        while(n > 0){
            if(n % 2 == 1){
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return res;
    }
}
