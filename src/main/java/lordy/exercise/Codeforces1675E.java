package lordy.exercise;
import java.util.Collections;
import java.util.Scanner;


//TODO  看不到错误用例什么样子
public class Codeforces1675E {


    public String helper(int n, int k, String s){
        int size = s.length();
        StringBuilder sb = new StringBuilder();
        if(k > 25){
            return String.join("", Collections.nCopies(size, "a"));
        }

        int maxHeight = 0;
        char maxLetter = (char) ('a' + k);
        int index = -1;
        for(int i = 0; i < size; i++){
            char cur = s.charAt(i);
            if(cur < maxLetter){
                maxHeight = Math.max(maxHeight, cur - 'a');
                sb.append('a');
            }else{
                index = i;
                break;
            }
        }

        if(index == -1){
            return sb.toString();
        }

        char start = (char) (s.charAt(index) - (k - maxHeight));
        char end  = s.charAt(index);
        sb.append(start);
        for(int i = index + 1; i < size; i++){
            char cur = s.charAt(i);
            if((cur >= start && cur <= end)){
                sb.append(start);
            }else if(cur - 'a' <= maxHeight){
                sb.append('a');
            }
            else{
                sb.append(cur);
            }


        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Codeforces1675E c = new Codeforces1675E();

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int t=sc.nextInt(); t-->0;) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            String res = c.helper(n, k , s);
            sb.append(res + "\n");
        }
        System.out.println(sb);



    }
}
