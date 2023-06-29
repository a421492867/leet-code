package lordy.everyday;

public class Leetcode263 {

    public boolean isUgly(int n) {
        if(n <= 0) return false;
        int[] factories = {2, 3, 5};
        for(int factory : factories){
            while (n % factory == 0){
                n /= factory;
            }
        }
        return n == 1;
    }
}
