package lordy.nowcoder.huawei;

import java.util.*;

public class Hj20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String result = "OK";
            String s = in.nextLine();

            if(s.length() <= 8){
                result = "NG";
            }
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    set.add(1);
                }else if(Character.isLowerCase(c)){
                    set.add(2);
                }else if(Character.isUpperCase(c)){
                    set.add(3);
                }else {
                    set.add(4);
                }
            }
            if(set.size() < 3){
                result = "NG";
            }
            for(int i = 0; i < s.length() - 2; i++){
                String cur = s.substring(i, i + 3);
                for(int j = i + 3; j < s.length() - 2; j++){
                    String next = s.substring(j, j + 3);
                    if(cur.equals(next)){
                        result = "NG";
                    }
                }
            }
            System.out.println(result);
        }
    }
}
