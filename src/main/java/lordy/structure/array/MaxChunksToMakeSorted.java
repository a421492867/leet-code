package lordy.structure.array;

/**
 * No.769
 */
public class MaxChunksToMakeSorted {

    public static int maxChunksToSorted(int[] arr){
        int length = arr.length;
        int res = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++){
            max = Math.max(max, arr[i]);
            if(max == i) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,0,1,2};
        System.out.println(maxChunksToSorted(arr));
    }
}
