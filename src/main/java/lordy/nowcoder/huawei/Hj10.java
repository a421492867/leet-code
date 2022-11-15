package lordy.nowcoder.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hj10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
