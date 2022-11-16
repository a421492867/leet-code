package lordy.nowcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hj40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String s = in.nextLine();
            int[] array = new int[4];
            for(int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);
                if(Character.isDigit(c)){
                    array[2]++;
                }else if(Character.isLetter(c)){
                   array[0]++;
                }else if(c == ' '){
                    array[1]++;
                }else {
                    array[3]++;
                }
            }
            for(int i = 0; i < 4; i++){
                System.out.println(array[i]);
            }
        }
    }
}
