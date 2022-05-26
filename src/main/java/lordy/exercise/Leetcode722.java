package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode722 {

    public List<String> removeComments(String[] source){
        boolean inBlock = false;
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();

        for(String line : source){
            int i = 0;
            char[] chars = line.toCharArray();
            if(!inBlock){
                sb = new StringBuilder();
            }
            while (i <line.length()){
                if(!inBlock && i + 1 < line.length() && chars[i] == '/' && chars[i + 1] == '*'){
                    inBlock = true;
                    i++;
                }else if(inBlock && i + 1 < line.length() && chars[i] == '*' && chars[i + 1] == '/'){
                    inBlock = false;
                    i++;
                }else if(!inBlock && i + 1 < line.length() && chars[i] == '/' && chars[i + 1] == '/'){
                    break;
                }else if(!inBlock){
                    sb.append(chars[i]);
                }
                i++;
            }
            if(!inBlock && sb.length() > 0){
                res.add(sb.toString());
            }
        }
        return res;
    }
}
