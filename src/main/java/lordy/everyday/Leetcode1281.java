package lordy.everyday;

public class Leetcode1281 {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while (n > 0){
            int mod = n % 10;
            sum += mod;
            mul *= mod;
            n /= 10;
        }
        return mul - sum;
    }
}
