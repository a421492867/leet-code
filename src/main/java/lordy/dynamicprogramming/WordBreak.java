package lordy.dynamicprogramming;

import java.util.*;

/**
 * No.139
 */
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict){
        return false;
    }




    public static void main(String[] args) {
        String s = "abcd";
        List<String> wordList = Arrays.asList("a", "abc","b","cd");

//        String s = "leetcode";
//        List<String> wordList = Arrays.asList("leet", "code");
        System.out.println(wordBreak(s, wordList));
    }
}
