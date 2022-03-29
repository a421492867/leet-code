package lordy.exercise;

public class Leetcode38 {

    public String countAndSay(int n){
        String str = "1";
        for(int i = 2; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int pos = 0;
            while(pos < str.length()){
                while (pos < str.length() && str.charAt(pos) == str.charAt(start)){
                    pos++;
                }
                sb.append((pos - start)).append(str.charAt(start));
                start = pos;
            }
            str = sb.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        Leetcode38 l = new Leetcode38();
        int n = 4;
        l.countAndSay(n);
    }
}
