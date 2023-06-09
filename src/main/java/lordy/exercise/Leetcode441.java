package lordy.exercise;

public class Leetcode441 {

    public int arrangeCoins(int n){
        int cur = 1;
        while (n > 0){
            n -= cur;
            cur++;
        }
        return n == 0 ? cur - 1 : cur - 2;
    }
}
