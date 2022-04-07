package lordy.exercise;

import lordy.tree.TreeNode;

public class Leetcode108 {

    public TreeNode sortedArrayToBST(int[] nums){
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int l, int r){
        if(l > r) return null;
        int mid = l + r >> 1;
        int rootVal = nums[mid];
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(nums, l, mid - 1);
        root.right = buildTree(nums, mid + 1, r);
        return root;
    }
}
