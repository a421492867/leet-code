package lordy.pointers;

import java.util.Arrays;

/**
 * No.88
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
       int end = m + n - 1;
       m--;
       n--;
        while(n >=0 || m >= 0){
            if(n < 0){
                nums1[end--] = nums1[m--];
            }else if(m < 0){
                nums1[end--] = nums2[n--];
            }else{
                if(nums1[m] < nums2[n]){
                    nums1[end--] = nums2[n--];
                }else{
                    nums1[end--] = nums1[m--];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}
