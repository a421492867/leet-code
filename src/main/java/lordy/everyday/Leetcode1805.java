package lordy.everyday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1805 {

    public int numDifferentIntegers(String word){
       char[] chars = word.toCharArray();
       int n = chars.length;

       Set<String> set = new HashSet<>();

       for(int i = 0; i < n; i++){
           if(Character.isLetter(chars[i])) continue;
           int r = i + 1;
           while (r < n && Character.isDigit(chars[r])){
               r++;
           }

           while (i < r && chars[i] == '0'){
               i++;
           }
           set.add(word.substring(i, r));
           i = r;
       }
        return set.size();
    }


}
