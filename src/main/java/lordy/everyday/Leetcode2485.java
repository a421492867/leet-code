package lordy.everyday;

public class Leetcode2485 {

    // 1 <= x <= n
    //1 + 2 + ... + x = x + x + 1 + ... + n
    public int pivotInteger(int n) {
        int t = (n * n + n) / 2;
        int x = (int) Math.sqrt(t);
        if (x * x == t) {
            return x;
        }
        return -1;
    }


}
