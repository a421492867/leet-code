package lordy.hot100;

import java.util.Random;

public class Leetcode528 {

    private Random random;

    private int[] preSum;

    public Leetcode528(int[] w) {
        this.random = new Random();
        this.preSum = new int[w.length + 1];
        for(int i = 1; i < w.length; i++){
            this.preSum[i] = this.preSum[i - 1] + w[i - 1];
        }
    }

    public int pickIndex(){
        int max = this.preSum[this.preSum.length - 1];
        int rand = random.nextInt(max) + 1;
        for(int i = 0; i < this.preSum.length; i++){
            if(rand <= preSum[i]){
                return i - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] w = {1};
        Leetcode528 l = new Leetcode528(w);
        l.pickIndex();

    }
}
