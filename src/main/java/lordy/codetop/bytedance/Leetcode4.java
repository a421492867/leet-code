package lordy.codetop.bytedance;

public class Leetcode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int m = nums1.length, n = nums2.length;
        if(m > n) return findMedianSortedArrays(nums2, nums1);

        int total = m + n;
        int l = 0, r = m, mid;
        int maxL = Integer.MIN_VALUE, minR = Integer.MAX_VALUE;
        while (l <= r){
            mid = l + (r - l) / 2;
            int b = total / 2 - mid;
            int ll = mid == 0 ? Integer.MIN_VALUE : nums1[mid - 1];
            int lr = mid == m ? Integer.MAX_VALUE : nums1[mid];
            int rl = b == 0 ? Integer.MIN_VALUE : nums2[b - 1];
            int rr = b == n ? Integer.MAX_VALUE : nums2[b];
            if(ll > rr){
                r = mid - 1;
            }else if(lr < rl){
                l = mid + 1;
            }else {
                maxL = Math.max(ll, rl);
                minR = Math.min(lr, rr);
                break;
            }
        }
        if(total % 2 == 1){
            return minR;
        }
        return (minR + maxL) / 2.0;
    }
}
