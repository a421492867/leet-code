package lordy.nowcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hj59 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int[] array = new int[26];
            for(int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);
                array[(int)(c - 'a')]++;
            }
            boolean flag = false;
            for(int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);
                if(array[(int)(c - 'a')] == 1){
                    System.out.println(c);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(-1);
            }
        }
    }
}
