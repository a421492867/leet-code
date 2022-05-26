package lordy.exercise;

import java.util.Arrays;

public class Leetcode854 {
    public int kSimilarity(String s1, String s2) {
        return kSimilarity(s1.toCharArray(), s2.toCharArray(), 0);
    }

    public int kSimilarity(char[] s1Arr, char[] s2Arr, int index){

        int n = s1Arr.length;
        int res = 0;
        for(int i = index; i < n; i++){
            if(s1Arr[i] == s2Arr[i]){
                continue;
            }else{
                int minAns = Integer.MAX_VALUE;
                char c = s1Arr[i];
                res++;
                for(int j = i + 1; j < n; j++){
                    if(s2Arr[j] == c){
                        swap(s2Arr, i, j);
                        minAns = Math.min(minAns, kSimilarity(s1Arr, s2Arr, i + 1));
                        swap(s2Arr, j, i);
                    }
                }

                return res + minAns;
            }
        }
        return res;
    }

    public void swap(char[] chars, int i, int j){

        char c = chars[i];
        chars[i]  = chars[j];
        chars[j] = c;
    }

}
