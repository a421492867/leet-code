package lordy.everyday;

public class Leetcode2490 {

    public boolean isCircularSentence(String sentence) {
        String[] array = sentence.split(" ");
        int n = array.length;
        for(int i = 1; i < n; i++){
            if(array[i].charAt(0) == array[i - 1].charAt(array[i - 1].length() - 1)){
                continue;
            }else {
                return false;
            }
        }
        return array[n - 1].charAt(array[n - 1].length() - 1) == array[0].charAt(0);
    }
}
