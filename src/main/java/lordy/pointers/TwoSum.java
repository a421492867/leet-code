package lordy.pointers;

/**
 * No.167
 */
public class TwoSum {

    public static int[] sum(int[] numbers, int target){
        int i = 0, j = numbers.length - 1;
        int result[] = new int[2];
        while (i < j){
            if(target > numbers[i] + numbers[j]){
                i++;
            }else if(target < numbers[i] + numbers[j]){
                j--;
            }else {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = sum(numbers, target);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
