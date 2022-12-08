package lordy.everyday;

public class Leetcode1812 {

    public boolean squareIsWhite(String coordinates){
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1) - '0';

        if((x + y) % 2 == 0){
            return false;
        }else {
            return true;
        }
    }
}
