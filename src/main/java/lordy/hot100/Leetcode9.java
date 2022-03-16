package lordy.hot100;

public class Leetcode9 {

    public boolean isPalindrome(int x){
        int temp = x, y = 0;
        while (temp > 0){
            y = y * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == y;
    }
}
