package lordy.nowcoder.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hj81 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < s1.length(); i++){
                set.add(s1.charAt(i));
            }
            for(int i = 0; i < s2.length(); i++){
                if(set.contains(s2.charAt(i))){
                    set.remove(s2.charAt(i));
                }
            }
            System.out.println(set.isEmpty());
        }
    }
}
