package lordy.pointers.exercise;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * No.524
 */
public class LongestWordInDictionaryThroughDeleting {

    public static String findLongestWord(String s, List<String> dictionary){

        dictionary.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String str : dictionary) {
            int a = 0, b = 0;
            while (a < s.length()) {
                if (s.charAt(a) == str.charAt(b)) {
                    b++;
                }
                a++;
                if (b == str.length()) {
                    return str;
                }

            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "aaa";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("a");
        dictionary.add("aa");
        dictionary.add("aaa");
        System.out.println(findLongestWord(s, dictionary));
    }
}
