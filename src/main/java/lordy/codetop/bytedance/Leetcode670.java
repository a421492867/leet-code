package lordy.codetop.bytedance;

public class Leetcode670 {

    public int maximumSwap(int num){
        char[] array = String.valueOf(num).toCharArray();
        int n  = array.length;
        int maxId = n - 1;
        int id1 = -1, id2 = -1;
        for(int i = n - 1; i >= 0; i++){
            if(array[i] > array[maxId]){
                maxId = i;
            }else if(array[i] < array[maxId]){
                id1 = i;
                id2 = maxId;
            }
        }
        if(id1 >= 0){
            swap(array, id1, id2);
        }
        String s = new String(array);
        return Integer.parseInt(s);
    }

    private void swap(char[] array, int i, int j){
        char x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

}
