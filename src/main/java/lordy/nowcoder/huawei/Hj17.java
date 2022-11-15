package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj17 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()){
//            String s = in.nextLine();
//            String[] array = s.split(";");
//            int x = 0, y = 0;
//            for(String str : array){
//                if(str.length() < 2 || str.length() > 3){
//                    continue;
//                }
//                char direction = s.charAt(0);
//                if(direction != 'A' && direction != 'D' && direction != 'W' && direction != 'S'){
//                    continue;
//                }
//                int location = 0;
//                for(int i = 1; i < s.length(); i++){
//                    if(s.charAt(i) < '0' || s.charAt(i) > '9'){
//                        break;
//                    }
//                    location += location * 10 + (s.charAt(i) - '0');
//                }
//                if(direction == 'A'){
//                    x -= location;
//                }else if(direction == 'D'){
//                    x += location;
//                }else if(direction == 'W'){
//                    y += location;
//                }else if(direction == 'S'){
//                    y -= location;
//                }
//            }
//            System.out.println(x + "," + y);
        helper("A10;S20;W10;D30;X;A1A;B10A11;;A10;");
        }

    public static void helper(String s){
        String[] array = s.split(";");
        int x = 0, y = 0;
        for(String str : array){
            if(str.length() < 2 || str.length() > 3){
                continue;
            }
            char direction = str.charAt(0);
            if(direction != 'A' && direction != 'D' && direction != 'W' && direction != 'S'){
                continue;
            }
            int location = 0;
            boolean flag = true;
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                    flag = false;
                    break;
                }
                location = location * 10 + (str.charAt(i) - '0');
            }
            if(flag){
                if(direction == 'A'){
                    x -= location;
                }else if(direction == 'D'){
                    x += location;
                }else if(direction == 'W'){
                    y += location;
                }else if(direction == 'S'){
                    y -= location;
                }
            }

        }
        System.out.println(x + "," + y);
    }

}



