package lordy.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Leetcode345 {

    public String reverseVowels(String s) {
        Character[] array = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.stream(array).collect(Collectors.toList());
        char[] chars = s.toCharArray();
        int n = chars.length;
        int l = 0, r = n - 1;
        while (l < r){
            while (!list.contains(chars[l]) && l < r){
                l++;
            }
            while (!list.contains(chars[r]) && l < r){
                r--;
            }
            swap(l, r, chars);
            l++;
            r--;
        }
        return new String(chars);
    }

    private void swap(int l, int r, char[] chars){
        char x = chars[l];
        chars[l] = chars[r];
        chars[r] = x;
    }

    public static void main(String[] args) {
        Leetcode345 l = new Leetcode345();
        String s = "hello";
        l.reverseVowels(s);
    }
}
