package lordy.everyday;

public class Leetcode2475 {

    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int numI = nums[i];
                    int numJ = nums[j];
                    int numK = nums[k];
                    if(numI != numJ && numJ != numK && numI != numK){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
