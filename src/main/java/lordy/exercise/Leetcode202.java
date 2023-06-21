package lordy.exercise;

import java.util.HashSet;
import java.util.Set;

public class Leetcode202 {

    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if(set.contains(n)) return false;
        if(n == 1) return true;
        set.add(n);
        return isHappy(helper(n));

    }

    private int helper(int n){
        String s = String.valueOf(n);
        int len = s.length();
        int res = 0;
        for(int i = 0; i < len; i++){
            res += Math.pow(s.charAt(i) - '0', 2);
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode202 l = new Leetcode202();
        l.isHappy(7);

    }
}
