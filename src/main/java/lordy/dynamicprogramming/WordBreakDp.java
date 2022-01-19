package lordy.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

/**
 * No.139
 */
public class WordBreakDp {

    public static boolean wordBreak(String s, List<String> wordDict){
        int length = s.length();
        boolean dp[] = new boolean[length + 1];
        dp[0] = true;
        int maxLen = 0;
        for (String str: wordDict){
            maxLen = Math.max(str.length(), maxLen);
        }

        for(int i = 1; i <= length; i++){
            for(int j = Math.max(0, i - maxLen); j < i; j++){
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        System.out.println(wordBreak(s, wordDict));
    }

}
