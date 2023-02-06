package lordy.codetop.jd;

public class Leetcode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int end = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (n >= 0 || m >= 0){
            if(n < 0){
                nums1[end--] = nums1[m--];
            }else if(m < 0){
                nums1[end--] = nums2[n--];
            }else {
                if(nums1[m] < nums2[n]){
                    nums1[end--] = nums2[n--];
                }else{
                    nums1[end--] = nums1[m--];
                }
            }
        }
    }
}
