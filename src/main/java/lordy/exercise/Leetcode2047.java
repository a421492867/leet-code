package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2047 {

    public int countValidWords(String sentence){
        if(sentence.length() == 0) return 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                if(sb.length() != 0){
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            }else {
                sb.append(sentence.charAt(i));
            }
        }
        if(sb.length() != 0){
            list.add(sb.toString());
        }
        int count = 0;
        for(String s : list){
            if(helper(s)){
                count++;
            }
        }
        return count;
    }

    private boolean helper(String s){
        int countFlag = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                return false;
            }
            if(!Character.isLetter(c)){
                if(c == '-'){
                    countFlag++;
                    if(i == 0 || i == s.length() - 1){
                        return false;
                    }
                    if(!Character.isLetter(s.charAt(i - 1)) || !Character.isLetter(s.charAt(i + 1))){
                        return false;
                    }
                }else{
                    if (i != s.length() - 1){
                        return false;
                    }
                }
            }
        }
        return countFlag <= 1;
    }

    public static void main(String[] args) {
        Leetcode2047 l = new Leetcode2047();
        l.countValidWords("cat and  dog");
    }
}
