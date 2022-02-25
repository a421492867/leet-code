package lordy.strings;

/**
 * No.696
 */
public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s){

        int n = s.length();
        if(n <= 1){
            return 0;
        }
        int pre = 0, cur = 1, count = 0;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                cur++;
            }else {
                pre = cur;
                cur = 1;
            }
            if(pre >= cur){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }
}
