package lordy.codetop.tx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode350 {

    public int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length, n = nums2.length;

        List<Integer> list = new ArrayList<>();
        int l = 0,  r = 0;
        while (l < m && r < n){
            if(nums1[l] == nums2[r]){
                list.add(nums1[l]);
                l++;
                r++;
            }else if(nums1[l] < nums2[r]){
                l++;
            }else {
                r++;
            }
        }

        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
