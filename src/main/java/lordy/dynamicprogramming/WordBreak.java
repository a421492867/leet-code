package lordy.dynamicprogramming;

import java.util.*;

/**
 * No.139
 * 超时
 */
public class WordBreak {


    private static boolean flag = false;

    public static boolean wordBreak(String s, List<String> wordDict){
        Collections.sort(wordDict, Comparator.comparingInt(String::length));
        backtrack(s, wordDict);
        return flag;
    }

    public static void backtrack(String s, List<String> wordDict){
        if(s.length() == 0){
            flag = true;
            return ;
        }
        for(String str : wordDict){
            if(str.length() <= s.length() && s.startsWith(str)){
                backtrack(s.substring(str.length()), wordDict);
            }
        }
    }


    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordList = Arrays.asList("cats","dog", "sand","and","cat");
        System.out.println(wordBreak(s, wordList));
    }
}
