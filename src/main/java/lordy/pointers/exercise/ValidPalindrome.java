package lordy.pointers.exercise;

/**
 * No.680
 */
public class ValidPalindrome {

    public static boolean validPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j){
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }

}
