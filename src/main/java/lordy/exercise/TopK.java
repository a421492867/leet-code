package lordy.exercise;

public class TopK {

    public int solution(int[] nums, int k){
        return nums[select(nums, 0, nums.length - 1, k)];
    }

    private int select(int[] nums, int l, int r, int k){
        int q = partition(nums, l, r);
        if(q == nums.length - k) return q;
        return q < nums.length - k ? select(nums, q + 1, r, k) : select(nums, l, q - 1, k);
    }

    private int partition(int[] nums, int l, int r){
        int x = nums[l];
        int i = l, j = r;
        while (i < j){
            while (i < j && nums[i++] <= x);
            while (i < j && nums[j--] >= x);
            if(i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, i, l);
        return i;
    }

    private void swap(int[] nums, int i, int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }


    public static void main(String[] args) {
        TopK topK = new TopK();
        int[] array = {1,5,3,9,4,7,8};
        System.out.println(topK.solution(array, 3));
    }
}
