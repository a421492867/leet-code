package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj87 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int rank = rank(s);
            if(rank >= 90){
                System.out.println("VERY_SECURE");
            }else if(rank >= 80){
                System.out.println("SECURE");
            }else if(rank >= 70){
                System.out.println("VERY_STRONG");
            }else if(rank >= 60){
                System.out.println("STRONG");
            }else if(rank >= 50){
                System.out.println("AVERAGE");
            }else if(rank >= 25){
                System.out.println("WEAK");
            }else{
                System.out.println("VERY_WEAK");
            }
        }

    }


    public static int rank(String s){
        int rank = 0;
        //0 数字  1 小字母  2 大字母  3 符号

        int length = s.length();
        if(length <= 4){
            rank += 5;
        }else if(length >= 5 && length <= 7){
            rank += 10;
        }else {
            rank += 25;
        }
        int[] array = new int[4];
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                array[0]++;
            }else if(Character.isLowerCase(c)){
                array[1]++;
            }else if(Character.isUpperCase(c)){
                array[2]++;
            }else {
                array[3]++;
            }
        }

        if(array[0] > 0){
            if(array[0] == 1){
                rank += 10;
            }else {
                rank += 20;
            }
        }
        if(array[1] > 0 || array[2] > 0){
            if(array[1] == 0){
                rank += 10;
            }else if(array[2] == 0){
                rank += 10;
            }else {
                rank += 20;
            }
        }

        if(array[3] > 0){
            if(array[3] == 1){
                rank += 10;
            }else {
                rank += 25;
            }
        }

        if(array[0] > 0 && array[1] > 0 && array[2] > 0 && array[3] > 0){
            rank+= 5;
            return rank;
        }

        if(array[0] > 0 && array[1] > 0 && array[2] > 0){
            rank += 3;
            return rank;
        }
        if(array[0] > 0 && array[1] > 0){
            rank += 2;
            return rank;
        }
        return rank;

    }
}
