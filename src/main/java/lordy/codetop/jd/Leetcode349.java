package lordy.codetop.jd;

import java.util.*;

public class Leetcode349 {

    public int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length, n = nums2.length;
        int l1 = 0, l2 = 0;
        Set<Integer> set = new HashSet<>();
        while (l1 < m && l2 < n){
            if(nums1[l1] == nums2[l2]){
                set.add(nums1[l1]);
                l1++;
                l2++;
            }else if(nums1[l1] < nums2[l2]){
                l1++;
            }else {
                l2++;
            }
        }

        List<Integer> list = new ArrayList<>(set);

        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
