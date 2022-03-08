package lordy.hot100;

public class Leetcode494 {

    private int res = 0;
    public int findTargetSumWays(int[] nums, int target){
        int startIndex = 0;
        backtrack(nums, target, 0, startIndex);
        return res;
    }

    public void backtrack(int[] nums, int target, int sum, int index){
        if(index == nums.length){
            if(sum == target) res++;
        }else {
            backtrack(nums, target, sum + nums[index], index + 1);
            backtrack(nums, target, sum - nums[index], index + 1);
        }

    }

    public static void main(String[] args) {
        Leetcode494 l = new Leetcode494();
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(l.findTargetSumWays(nums, target));
    }
}
