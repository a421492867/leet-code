package lordy.exercise;

public class Leetcode8 {

    public int myAtoi(String s){
        int n = s.length();

        int flag = 0;
        long res = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(flag != 0){
                    return 0;
                }
                continue;
            }
            if(c == '+' || c == '-'){
                if(flag != 0){
                    return 0;
                }
                flag = c == '+' ? 1 : -1;
                continue;
            }
            if(Character.isLetter(c)){
                return 0;
            }
            if(Character.isDigit(c)){
                res = 10 * res + (c - '0');
                for(int j = i + 1; j < n; j++){
                    char ch = s.charAt(j);
                    if(Character.isLetter(ch) || ch == ' ' || ch == '+' || ch == '-' || ch == '.'){
                        break;
                    }else{
                        res = 10 * res + (ch - '0');
                        if(flag >= 0 && res > Integer.MAX_VALUE){
                            return Integer.MAX_VALUE;
                        }else if(flag < 0 && -res < Integer.MIN_VALUE){
                            return Integer.MIN_VALUE;
                        }
                    }
                }
            }
            break;
        }
        return  flag >= 0 ? (int)res : (int)-res;
    }

    public static void main(String[] args) {
        Leetcode8 l = new Leetcode8();
        String s = "words and 987";
        
        l.myAtoi(s);
    }
}
