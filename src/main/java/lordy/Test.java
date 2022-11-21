package lordy;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1075);
        nums.add(25);
        nums.add(16);
        nums.add(31);
        nums.add(17);
        nums.add(12);
        nums.add(20);


        List<Character> ops = new ArrayList<>();
        //ops.add('<');
        ops.add('*');
       // ops.add('|');
        //ops.add('%');
        ops.add('/');
        ops.add('p');
        //ops.add('+');


        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < ops.size(); j++){
                for(int k = 0; k < nums.size(); k++){
                    if(k == i) continue;
                    int res = helper(nums.get(i), ops.get(j), nums.get(k));
                    for(int a = 0; a < nums.size(); a++){
                        for(int b = 0; b < ops.size(); b++){
                            if(a == i || a == k || b == j){
                                continue;
                            }
                            int res2 = helper(res, ops.get(b), nums.get(a));
                            for(int c = 0; c < nums.size(); c++){
                                for(int d = 0; d < ops.size(); d++){
                                    if(c == i || c == k || c == a || d == j || d == b) continue;
                                    int res3 = helper(res2, ops.get(d), nums.get(c));
                                    if(res3 == 1024){
                                        System.out.println(nums.get(i) + " " + ops.get(j)  + nums.get(k) + " " + " " + nums.get(a) + " " + ops.get(b) + " " + nums.get(c) + " " + ops.get(d));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static Integer helper(Integer num1, Character op, Integer num2){
        if(op == '-'){
            return num1 - num2;
        }else if(op == '<'){
            return num1 << num2;
        }else if(op == '|'){
            return num1 | num2;
        }else if(op == '/'){
            return num1 / num2;
        }else if(op == '%'){
            return num1 % num2;
        }else if(op == '+'){
            return num1 + num2;
        }else if(op == 'p'){
            return (int) Math.pow(num1.doubleValue(), num2.doubleValue());
        }
        else {
            return num1 - num2;
        }
    }
}