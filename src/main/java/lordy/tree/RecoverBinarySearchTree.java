package lordy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * No.99
 */
//TODO
public class RecoverBinarySearchTree {

    public static void recoverTree(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int[] swapped = findTwoSwapped(nums);
        recover(root, 2, swapped[0], swapped[1]);
    }

    public static void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }

    public static int[] findTwoSwapped(List<Integer> nums){
        int n = nums.size(), index1 = -1, index2 = -1;
        for(int i = 0; i < n - 1; i++){
            if(nums.get(i + 1) < nums.get(i)){
                index2 = i + 1;
                if(index1 == -1){
                    index1 = i;
                }else {
                    break;
                }
            }
        }
        int x = nums.get(index1), y = nums.get(index2);
        return new int[]{x, y};
    }

    public static void recover(TreeNode root, int count, int x, int y){
        if(root != null){
            if(root.val == x || root.val == y){
                root.val = root.val == x ? y : x;
                if(--count == 0) return;
            }
            recover(root.right, count, x, y);
            recover(root.left, count, x, y);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        t2.right = t3;
        root.left = t2;
        recoverTree(root);
    }


}
