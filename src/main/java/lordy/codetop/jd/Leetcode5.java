package lordy.codetop.jd;

public class Leetcode5 {

    public String longestPalindrome(String s){
        int n = s.length();
        int l = 0, r = 0;
        for(int i = 0; i < n; i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > r - l){
                l = i - (len - 1) / 2;
                r = i + len / 2;
            }
        }
        return s.substring(l, r + 1);
    }

    public int expand(String s, int i, int j){
        int n = s.length();
        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 1;
    }
}
