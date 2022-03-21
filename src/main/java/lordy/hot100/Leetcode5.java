package lordy.hot100;

/**
 * 中心扩展法
 */
public class Leetcode5 {

    public static String longestPalindrome(String s){
        int n = s.length();
        if(n == 0) return "";
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expand(String s, int l, int r){
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);
    }
}
