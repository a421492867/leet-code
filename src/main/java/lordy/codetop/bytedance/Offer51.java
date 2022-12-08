package lordy.codetop.bytedance;

public class Offer51 {

    int res = 0;
    int[] aux;
    public int reversePairs(int[] nums) {
        aux = new int[nums.length];
        sort(nums, 0, nums.length - 1);
        return res;
    }

    private void sort(int[] nums, int l, int r){
        if(l >= r) return;
        int mid = l + r >> 1;
        sort(nums,l, mid);
        sort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    private void merge(int[] nums, int l, int mid, int r){
        int i = l, j = mid + 1;
        int index = l;
        for(int k = l; k <= r; k++){
            aux[k] = nums[k];
        }
        while(i <= mid || j <= r){
            if(i > mid){
                nums[index++] = aux[j++];
            }else if(j > r){
                nums[index++] = aux[i++];
            }else{
                if(aux[i] > aux[j]){
                    res += mid - i + 1;
                    nums[index++] = aux[j++];
                }else{
                    nums[index++] = aux[i++];
                }
            }
        }
    }
}
