package lordy.exercise;

public class Leetcode343 {

    public int cuttingRope(int n) {
        int mod = n % 3, multi = n / 3;

        if(multi == 0){
            return n;
        }
        if(mod == 1){
            return (int) ( 2 * 2 * Math.pow(3, multi - 1));
        }

        if(mod == 2){
            return (int) (2 * Math.pow(3, multi));
        }
        return (int)Math.pow(3, multi);
    }
}
