package lordy.strings;

/**
 * No.28
 * KMP
 */
public class ImplementstrStr {

    public static int strStr(String haystack, String needle){
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }
        int m = haystack.length(), n = needle.length();
        int[] pi = new int[n];
        for(int i = 1; i < n; i++){
            int j = pi[i - 1];
            while (j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if(needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            pi[i] = j;
        }

        for(int i = 0, j = 0; i < m; i++){
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == n){
                return i - n + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }
}
