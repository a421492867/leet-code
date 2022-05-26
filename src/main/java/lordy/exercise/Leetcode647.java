package lordy.exercise;

public class Leetcode647 {

    public int countSubstrings(String s) {

        int res = 0, n = s.length();
        for(int i = 0; i < n; i++){
            res += (expand(s, i, i) + 1) / 2;
            res += expand(s, i, i + 1) / 2;
        }
        return res;

    }

    public int expand(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;

    }
}
