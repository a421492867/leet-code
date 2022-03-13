package lordy.hot100;

import lordy.tree.TreeNode;

public class Leetcode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder){
        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode helper(int[] preorder, int pStartIndex, int pEndIndex, int[] inorder, int iStartIndex, int iEndIndex){
        if(pStartIndex == pEndIndex) return null;
        int rootVal = preorder[pStartIndex];
        TreeNode root = new TreeNode(rootVal);
        int leftIndex = -1;
        for(int i = 0; i < iEndIndex; i++){
            if(rootVal == inorder[i]){
                leftIndex = i;
                break;
            }
        }
        int leftNum = leftIndex - iStartIndex;
        root.left = helper(preorder, pStartIndex + 1, pStartIndex + leftNum + 1, inorder, iStartIndex, leftIndex);
        root.right = helper(preorder, pStartIndex + leftNum + 1, pEndIndex, inorder, leftIndex + 1, iEndIndex);
        return root;
    }
}
