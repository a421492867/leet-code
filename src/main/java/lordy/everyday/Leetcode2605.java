package lordy.everyday;

import java.util.Arrays;
import java.util.TreeSet;

public class Leetcode2605 {

    public int minNumber(int[] nums1, int[] nums2){
        TreeSet<Integer> s1 = new TreeSet<>(), s2 = new TreeSet<>(); // 开两个集合
        for (int num: nums1) s1.add(num);
        for (int num: nums2) s2.add(num); // 把数组中的元素全部添加到对应集合当中
        s1.retainAll(s2); // 求出两集合的交集
        if (s1.size() != 0) { // 交集不为空
            return s1.first(); // 返回交集中最小的那个数
        }
        int x = Arrays.stream(nums1).min().getAsInt();
        int y = Arrays.stream(nums2).min().getAsInt(); // 分别取两个数组中的最小值
        return Math.min(x, y) * 10 + Math.max(x, y); // 更小的数放在答案的十位数上


    }
}
