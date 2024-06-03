package lordy.everyday;

public class Leetcode1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int cur = 1;
        int index = 0;
        while (candies > 0){
            if(index == num_people){
                index = 0;
            }
            res[index] += Math.min(cur, candies);
            candies -= cur;
            cur++;
            index++;
        }
        return res;
    }
}
