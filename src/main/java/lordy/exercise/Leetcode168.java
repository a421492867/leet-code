package lordy.exercise;

public class Leetcode168 {

    public String convertToTile(int columnNumber){

        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
