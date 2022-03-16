package lordy.hot100;

import java.util.Random;

public class Leetcode215 {

    public int findKthLargest(int[] nums, int k){
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public int quickSelect(int[] arr, int l, int r, int index){
        int q = randomPartition(arr, l, r);
        if (q == index) {
            return arr[q];
        } else {
            return q < index ? quickSelect(arr, q + 1, r, index) : quickSelect(arr, l, q - 1, index);
        }

    }

    public int randomPartition(int[] arr, int l, int r){
        Random random = new Random();
        int i = random.nextInt(r - l + 1) + l;
        swap(arr, i, r);
        return partition(arr, l, r);
    }

    public int partition(int[] arr, int l, int r){
        int x = arr[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (arr[j] <= x) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;

    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
