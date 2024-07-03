package lordy.everyday;

public class Leetcode3099 {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int y = x;
        while(y > 0){
            int mod = y % 10;
            sum += mod;
            y = y / 10;
        }
        if(x % sum == 0) return sum;
        return -1;
    }
}
