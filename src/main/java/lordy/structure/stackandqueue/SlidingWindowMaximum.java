package lordy.structure.stackandqueue;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * No.239
 */
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int nums[], int k){

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(JSON.toJSONString(maxSlidingWindow(nums, k)));
    }
}
