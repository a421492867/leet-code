package lordy.search;

import java.util.*;
import java.util.stream.Collectors;

/**
 * No.126
 */
//TODO 超时
public class WordLadder {

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList){
        List<List<String>> res = new ArrayList<>();
        if(!wordList.contains(endWord)){
            return res;
        }
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        dfs(beginWord, endWord, wordList, list, res);
        List<List<String>> sortedList = res.stream().sorted(Comparator.comparingInt(List::size)).collect(Collectors.toList());
        List<List<String>> result = sortedList.stream().filter(o1 -> o1.size() <= sortedList.get(0).size()).collect(Collectors.toList());
        return result;
    }


    public static void dfs(String beginWord, String endWord, List<String> wordList, List<String> list, List<List<String>> res){
        if(beginWord.equals(endWord)){
            res.add(new ArrayList<>(list));
            return;
        }
        for(String s2 : wordList){
            if(isOneLetterDiffer(beginWord, s2) && !list.contains(s2)){
                list.add(s2);
                dfs(s2, endWord, wordList, list, res);
                list.remove(s2);
            }
        }
    }

    public static boolean isOneLetterDiffer(String s1, String s2){
        int differ = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                differ++;
            }
        }
        return differ == 1;
    }

    public static void main(String[] args) {
        String s1 = "hit";
        String s2 = "cog";
        String[] strs = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = Arrays.asList(strs);
        System.out.println(findLadders(s1, s2, wordList));
    }
}
