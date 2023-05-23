package lordy.exercise;

public class Leetcode2697 {

    public String makeSmallestPalindrome(String s){
        char[] array = s.toCharArray();
        int n = array.length;
        int start = 0, end = n - 1;
        while (start < end){
            if(array[start] == array[end]){
                start++;
                end--;
            }else {
                if(array[start] < array[end]){
                    array[end] = array[start];
                }else {
                    array[start] = array[end];
                }
                start++;
                end--;
            }
        }
        return new String(array);
    }
}
