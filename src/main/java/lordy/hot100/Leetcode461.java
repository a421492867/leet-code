package lordy.hot100;

public class Leetcode461 {

    public int hammingDistance(int x, int y){
        return Integer.bitCount(x ^ y);
    }
}
