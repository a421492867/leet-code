package lordy.codetop.tx;

public class Leetcode557 {

    public String reverseWords(String s){
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : array){
            sb.append(reverse(str)).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }


    private String reverse(String s){
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r){
            char x = chars[l];
            chars[l] = chars[r];
            chars[r] = x;
            l++;
            r--;
        }
        return new String(chars);
    }
}
