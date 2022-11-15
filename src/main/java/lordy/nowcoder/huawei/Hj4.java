package lordy.nowcoder.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hj4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            List<String> list = helper(s);
            for(String str : list){
                System.out.println(str);
            }
        }
    }

    public static List<String> helper(String s){
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i != 0 && i % 8 == 0){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(s.charAt(i));

        }
        while (sb.length() > 0 && sb.length() < 8){
            sb.append("0");
        }
        if(sb.length() > 0){
            list.add(sb.toString());
        }
        return list;
    }
}
