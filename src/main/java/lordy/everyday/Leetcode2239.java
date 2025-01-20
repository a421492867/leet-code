package lordy.everyday;

public class Leetcode2239 {

    public int findCloseNumber(int[] nums){
        int cur = Integer.MAX_VALUE;
        int curVal = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int distance = 0;
            if(nums[i] < 0){
                distance = -nums[i];
            }else{
                distance = nums[i];
            }
            if(cur >= distance){
                if(cur == distance){
                    curVal = Math.max(nums[i], curVal);
                }else{
                    cur = distance;
                    curVal = nums[i];
                }

            }
        }
        return curVal;
    }
}
