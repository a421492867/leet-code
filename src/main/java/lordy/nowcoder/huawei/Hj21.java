package lordy.nowcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hj21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("def", 3);
        map.put("ghi", 4);
        map.put("jkl", 5);
        map.put("mno", 6);
        map.put("pqrs", 7);
        map.put("tuv", 8);
        map.put("wxyz", 9);
        while (in.hasNextLine()){
            String s = in.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);
                if(Character.isDigit(c)) {
                    sb.append(c);
                }else if(Character.isLowerCase(c)){
                    for(String key : map.keySet()){
                        if(key.contains(c.toString())){
                            sb.append(map.get(key));
                        }
                    }
                }else{
                    c = Character.toLowerCase(c);
                    if(c == 'z'){
                        sb.append('a');
                    }else {
                        sb.append((char)(c + 1));
                    }
                }
            }
            System.out.println(sb);
        }

    }


    public static void helper(String s){
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("def", 3);
        map.put("ghi", 4);
        map.put("jkl", 5);
        map.put("mno", 6);
        map.put("pqrs", 7);
        map.put("tuv", 8);
        map.put("wxyz", 9);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
            }else if(Character.isLowerCase(c)){
                for(String key : map.keySet()){
                    if(key.contains(c.toString())){
                        sb.append(map.get(key));
                    }
                }
            }else{
                c = Character.toLowerCase(c);
                if(c == 'z'){
                    sb.append('a');
                }else {
                    sb.append((char)(c + 1));
                }
            }
        }
        System.out.println(sb);
    }
}
