package lordy.hot100;

import lordy.tree.TreeNode;

public class Leetcode108 {

    public TreeNode sortedArrayToBST(int[] nums){
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int l, int r){
        if(l > r) return null;
        int mid = l + (r - l) / 2;
        int rootVal = nums[mid];
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(nums, l, mid - 1);
        root.right = buildTree(nums, mid + 1, r);
        return root;
    }
}
