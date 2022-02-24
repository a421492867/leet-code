package lordy.strings;

/**
 * No.647
 */
public class PalindromicSubstrings {

    public static int countSubstrings(String s){
        int ans = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            ans += isPalindromic(i, i, s);
            ans += isPalindromic(i, i + 1, s);
        }
        return ans;
    }

    public static int isPalindromic(int l, int r, String s){
        int cnt = 0;
        while (l >= 0 && r < s.length()){
            if(s.charAt(l) != s.charAt(r)) return cnt;
            cnt++;
            l--;
            r++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
